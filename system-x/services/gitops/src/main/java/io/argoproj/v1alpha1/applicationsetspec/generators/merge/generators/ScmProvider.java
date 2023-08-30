package io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"awsCodeCommit","azureDevOps","bitbucket","bitbucketServer","cloneProtocol","filters","gitea","github","gitlab","requeueAfterSeconds","template","values"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ScmProvider implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("awsCodeCommit")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.AwsCodeCommit awsCodeCommit;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.AwsCodeCommit getAwsCodeCommit() {
        return awsCodeCommit;
    }

    public void setAwsCodeCommit(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.AwsCodeCommit awsCodeCommit) {
        this.awsCodeCommit = awsCodeCommit;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("azureDevOps")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.AzureDevOps azureDevOps;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.AzureDevOps getAzureDevOps() {
        return azureDevOps;
    }

    public void setAzureDevOps(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.AzureDevOps azureDevOps) {
        this.azureDevOps = azureDevOps;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("bitbucket")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.Bitbucket bitbucket;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.Bitbucket getBitbucket() {
        return bitbucket;
    }

    public void setBitbucket(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.Bitbucket bitbucket) {
        this.bitbucket = bitbucket;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("bitbucketServer")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.BitbucketServer bitbucketServer;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.BitbucketServer getBitbucketServer() {
        return bitbucketServer;
    }

    public void setBitbucketServer(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.BitbucketServer bitbucketServer) {
        this.bitbucketServer = bitbucketServer;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cloneProtocol")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String cloneProtocol;

    public String getCloneProtocol() {
        return cloneProtocol;
    }

    public void setCloneProtocol(String cloneProtocol) {
        this.cloneProtocol = cloneProtocol;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("filters")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.Filters> filters;

    public java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.Filters> getFilters() {
        return filters;
    }

    public void setFilters(java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.Filters> filters) {
        this.filters = filters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("gitea")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.Gitea gitea;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.Gitea getGitea() {
        return gitea;
    }

    public void setGitea(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.Gitea gitea) {
        this.gitea = gitea;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("github")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.Github github;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.Github getGithub() {
        return github;
    }

    public void setGithub(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.Github github) {
        this.github = github;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("gitlab")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.Gitlab gitlab;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.Gitlab getGitlab() {
        return gitlab;
    }

    public void setGitlab(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.Gitlab gitlab) {
        this.gitlab = gitlab;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("requeueAfterSeconds")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long requeueAfterSeconds;

    public Long getRequeueAfterSeconds() {
        return requeueAfterSeconds;
    }

    public void setRequeueAfterSeconds(Long requeueAfterSeconds) {
        this.requeueAfterSeconds = requeueAfterSeconds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("template")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.Template template;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.Template getTemplate() {
        return template;
    }

    public void setTemplate(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.scmprovider.Template template) {
        this.template = template;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("values")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> values;

    public java.util.Map<java.lang.String, String> getValues() {
        return values;
    }

    public void setValues(java.util.Map<java.lang.String, String> values) {
        this.values = values;
    }
}

