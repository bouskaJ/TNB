package io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"azuredevops","bitbucket","bitbucketServer","filters","gitea","github","gitlab","requeueAfterSeconds","template"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class PullRequest implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("azuredevops")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.Azuredevops azuredevops;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.Azuredevops getAzuredevops() {
        return azuredevops;
    }

    public void setAzuredevops(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.Azuredevops azuredevops) {
        this.azuredevops = azuredevops;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("bitbucket")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.Bitbucket bitbucket;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.Bitbucket getBitbucket() {
        return bitbucket;
    }

    public void setBitbucket(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.Bitbucket bitbucket) {
        this.bitbucket = bitbucket;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("bitbucketServer")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.BitbucketServer bitbucketServer;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.BitbucketServer getBitbucketServer() {
        return bitbucketServer;
    }

    public void setBitbucketServer(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.BitbucketServer bitbucketServer) {
        this.bitbucketServer = bitbucketServer;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("filters")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.Filters> filters;

    public java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.Filters> getFilters() {
        return filters;
    }

    public void setFilters(java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.Filters> filters) {
        this.filters = filters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("gitea")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.Gitea gitea;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.Gitea getGitea() {
        return gitea;
    }

    public void setGitea(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.Gitea gitea) {
        this.gitea = gitea;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("github")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.Github github;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.Github getGithub() {
        return github;
    }

    public void setGithub(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.Github github) {
        this.github = github;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("gitlab")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.Gitlab gitlab;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.Gitlab getGitlab() {
        return gitlab;
    }

    public void setGitlab(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.Gitlab gitlab) {
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
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.Template template;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.Template getTemplate() {
        return template;
    }

    public void setTemplate(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.Template template) {
        this.template = template;
    }
}

