package software.tnb.knative.resource;

import io.argoproj.v1alpha1.applicationspec.Destination;
import io.argoproj.v1alpha1.appprojectspec.ClusterResourceWhitelist;

import io.argoproj.v1alpha1.appprojectspec.Destinations;

import io.fabric8.openshift.api.model.Project;

import software.tnb.common.account.NoAccount;
import software.tnb.common.deployment.OpenshiftDeployable;
import software.tnb.common.deployment.WithOperatorHub;
import software.tnb.common.openshift.OpenshiftClient;
import software.tnb.common.service.Service;
import software.tnb.common.utils.WaitUtils;
import software.tnb.knative.service.ArgoClient;
import software.tnb.knative.validation.GitOpsValidation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.auto.service.AutoService;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Predicate;

import io.argoproj.v1alpha1.AppProject;
import io.argoproj.v1alpha1.AppProjectSpec;
import io.fabric8.kubernetes.api.model.Pod;
import io.fabric8.kubernetes.client.dsl.base.CustomResourceDefinitionContext;

@AutoService(GitOps.class)
public class GitOps extends Service<NoAccount, ArgoClient, GitOpsValidation> implements OpenshiftDeployable, WithOperatorHub {
    private static final Logger LOG = LoggerFactory.getLogger(GitOps.class);
    private static final String CRD_GROUP = "argoproj.io";
    private static final String CRD_VERSION = "v1alpha1";

    public static final String ARGO_PROJECT_NAME = "tnb-" + UUID.randomUUID();
    public static final String GITOPS_NAMESPACE = "openshift-gitops";

    private final ArgoClient client = new ArgoClient();

    private static final CustomResourceDefinitionContext ARGOCD_CTX = new CustomResourceDefinitionContext.Builder()
        .withName("ArgoCD")
        .withGroup(CRD_GROUP)
        .withVersion(CRD_VERSION)
        .withPlural("argocds")
        .withScope("Namespaced")
        .build();

    private AppProject createProject(String projectName) {
        LOG.debug("Create Argo project", ARGO_PROJECT_NAME);
        AppProject project = new AppProject();
        project.getMetadata().setName(projectName);
        project.setSpec(new AppProjectSpec());

        ClusterResourceWhitelist whitelist = new ClusterResourceWhitelist();
        whitelist.setGroup("*");
        whitelist.setKind("*");

        Destinations dest = new Destinations();
        dest.setNamespace("*");
        dest.setServer("*");

        project.getSpec().setClusterResourceWhitelist(List.of(whitelist));
        project.getSpec().setDestinations(List.of(dest));
        project.getSpec().setSourceRepos(List.of("*"));
        return OpenshiftClient.get().customResources(AppProject.class).inNamespace(GITOPS_NAMESPACE).create(project);
    }

    @Override
    public GitOpsValidation validation() {
        if (validation == null) {
            validation = new GitOpsValidation(client);
        }
        return validation;
    }

    @Override
    public void undeploy() {
        LOG.debug("Undeploy GitOps operator");
        OpenshiftClient.get().deleteProject(GITOPS_NAMESPACE);
        // wait for all finalizers to finish
        WaitUtils.waitFor(() -> OpenshiftClient.get().getProject(GITOPS_NAMESPACE) == null, String.format("Removing %s project", GITOPS_NAMESPACE));

        deleteSubscription(
            () -> OpenshiftClient.get().pods().inNamespace(targetNamespace()).withName("gitops-operator-controller-manager").get() == null);
    }

    @Override
    public void openResources() {
        // no-op
    }

    @Override
    public void closeResources() {
        if (validation != null) {
            //    validation.deleteCreatedResources();
        }
    }

    @Override
    public void create() {
        LOG.debug("Creating GitOps operator");

        // Create subscription for gitops operator
        createSubscription();

        // The GitOps operator also creates openshift-gitops namespace
        WaitUtils.waitFor(() -> OpenshiftClient.get().namespaces().withName(GITOPS_NAMESPACE).get() != null,
            "Waiting until the gitops namespace is created");

        // Create CD project specific to this TNB run
        createProject(ARGO_PROJECT_NAME);

        // Enable GitOps operator access
        // Apply new label to the Namespace object since the Project is immutable
        OpenshiftClient.get().namespaces().withName(OpenshiftClient.get().getProject().getMetadata().getName()).edit((p) -> {
            p.getMetadata().getLabels().put("argocd.argoproj.io/managed-by", GITOPS_NAMESPACE);
            return p;
        });
    }

    @Override
    public boolean isReady() {
        Map<String, Object> argoCd = OpenshiftClient.get().customResource(ARGOCD_CTX).withName("openshift-gitops").inNamespace(GITOPS_NAMESPACE).get();
        return argoCd != null
            && argoCd.get("status") != null
            && ((Map<String, String>) argoCd.get("status")).get("phase")
            .equals("Available");
    }

    @Override
    public boolean isDeployed() {
        return OpenshiftClient.get().pods().inNamespace(targetNamespace()).withName("gitops-operator-controller-manager").get() != null;
    }

    @Override
    public Predicate<Pod> podSelector() {
        // not applicable
        return null;
    }

    @Override
    public void restart() {
        // not applicable
    }

    @Override
    public String targetNamespace() {
        return "openshift-operators";
    }

    @Override
    public String operatorName() {
        return "openshift-gitops-operator";
    }

    @Override
    public String operatorChannel() {
        return "latest";
    }

    @Override
    public boolean clusterWide() {
        return true;
    }
}
