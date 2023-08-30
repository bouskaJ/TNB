package io.argoproj.v1alpha1.applicationsetspec.generators.merge;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"clusterDecisionResource","clusters","git","list","matrix","merge","plugin","pullRequest","scmProvider","selector"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Generators implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("clusterDecisionResource")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.ClusterDecisionResource clusterDecisionResource;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.ClusterDecisionResource getClusterDecisionResource() {
        return clusterDecisionResource;
    }

    public void setClusterDecisionResource(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.ClusterDecisionResource clusterDecisionResource) {
        this.clusterDecisionResource = clusterDecisionResource;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("clusters")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.Clusters clusters;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.Clusters getClusters() {
        return clusters;
    }

    public void setClusters(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.Clusters clusters) {
        this.clusters = clusters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("git")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.Git git;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.Git getGit() {
        return git;
    }

    public void setGit(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.Git git) {
        this.git = git;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("list")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.List list;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.List getList() {
        return list;
    }

    public void setList(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.List list) {
        this.list = list;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("matrix")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.AnyType matrix;

    public io.fabric8.kubernetes.api.model.AnyType getMatrix() {
        return matrix;
    }

    public void setMatrix(io.fabric8.kubernetes.api.model.AnyType matrix) {
        this.matrix = matrix;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("merge")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.AnyType merge;

    public io.fabric8.kubernetes.api.model.AnyType getMerge() {
        return merge;
    }

    public void setMerge(io.fabric8.kubernetes.api.model.AnyType merge) {
        this.merge = merge;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("plugin")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.Plugin plugin;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.Plugin getPlugin() {
        return plugin;
    }

    public void setPlugin(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.Plugin plugin) {
        this.plugin = plugin;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("pullRequest")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.PullRequest pullRequest;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.PullRequest getPullRequest() {
        return pullRequest;
    }

    public void setPullRequest(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.PullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scmProvider")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.ScmProvider scmProvider;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.ScmProvider getScmProvider() {
        return scmProvider;
    }

    public void setScmProvider(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.ScmProvider scmProvider) {
        this.scmProvider = scmProvider;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("selector")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.Selector selector;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.Selector getSelector() {
        return selector;
    }

    public void setSelector(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.Selector selector) {
        this.selector = selector;
    }
}

