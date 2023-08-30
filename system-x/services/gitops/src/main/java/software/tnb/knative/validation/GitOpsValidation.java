package software.tnb.knative.validation;

import software.tnb.common.openshift.OpenshiftClient;
import software.tnb.common.validation.Validation;
import software.tnb.knative.resource.GitOps;
import software.tnb.knative.service.ArgoClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class GitOpsValidation implements Validation {
    private static final Logger LOG = LoggerFactory.getLogger(GitOpsValidation.class);
    private ArgoClient client;

    public GitOpsValidation(ArgoClient client) {
        this.client = client;
    }

    public void createApplication(String name, String repo, String path) {
        client.createApp(name, OpenshiftClient.get().getNamespace(), repo, path, GitOps.ARGO_PROJECT_NAME);
    }

    public void configureRepository(String name, String url, boolean insecure) {
        this.client.configureRepo(name, url, insecure, GitOps.ARGO_PROJECT_NAME);
    }

    public void syncApp(String name, String revision) throws IOException {
        client.syncApp(name, revision);
    }
}
