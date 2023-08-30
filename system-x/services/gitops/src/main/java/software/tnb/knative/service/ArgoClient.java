package software.tnb.knative.service;

import io.fabric8.kubernetes.api.model.Secret;

import software.tnb.common.openshift.OpenshiftClient;
import software.tnb.knative.resource.GitOps;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;

import io.argoproj.v1alpha1.Application;
import io.argoproj.v1alpha1.ApplicationSpec;
import io.argoproj.v1alpha1.applicationspec.Destination;
import io.argoproj.v1alpha1.applicationspec.Source;
import io.fabric8.kubernetes.api.model.SecretBuilder;
import io.fabric8.kubernetes.client.dsl.base.CustomResourceDefinitionContext;
import io.fabric8.kubernetes.client.dsl.internal.RawCustomResourceOperationsImpl;

public class ArgoClient {
    public void configureRepo(String name, String url, boolean insecure, String project) {
        Secret repo = new SecretBuilder()
            .withStringData(Map.of(
                    "insecure", String.valueOf(insecure),
                    "type", "https",
                    "url", url,
                    project, project
                )
            )
            .withNewMetadata().withName(name)
            .withAnnotations(Map.of("managed-by", "argocd.argoproj.io"))
            .withLabels(Map.of("argocd.argoproj.io/secret-type", "repository")).endMetadata()
            .build();

        OpenshiftClient.get().secrets().inNamespace(GitOps.GITOPS_NAMESPACE).create(repo);
    }

    public Application createApp(String name, String namespace, String repo, String path, String project) {
        Application app = new Application();
        app.getMetadata().setName(name);

        ApplicationSpec spec = new ApplicationSpec();
        spec.setProject(project);
        app.setSpec(spec);

        Source src = new Source();
        src.setRepoURL(repo);
        src.setPath(path);
        spec.setSource(src);

        Destination dest = new Destination();
        dest.setServer("https://kubernetes.default.svc");
        dest.setNamespace(namespace);
        spec.setDestination(dest);

        return OpenshiftClient.get().customResources(Application.class).inNamespace(GitOps.GITOPS_NAMESPACE).create(app);
    }

    public void syncApp(String name, String revision) throws IOException {

        // there is no field in model class Application#operation - use map modification
        CustomResourceDefinitionContext context = new CustomResourceDefinitionContext.Builder()
            .withName("Application")
            .withGroup("argoproj.io")
            .withVersion("v1alpha1")
            .withPlural("applications")
            .withScope("Namespaced")
            .build();

        RawCustomResourceOperationsImpl cli = OpenshiftClient.get().customResource(context).inNamespace(GitOps.GITOPS_NAMESPACE);

        Map<String, Object> app = cli.withName(name).get();

        Map<String, String> sync = Map.of("revision", revision);
        app.put("operation", Map.of("sync", sync));

        cli.createOrReplace(app);
    }
}
