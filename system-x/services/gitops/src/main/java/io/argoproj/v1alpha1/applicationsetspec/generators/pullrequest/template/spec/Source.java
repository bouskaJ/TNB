package io.argoproj.v1alpha1.applicationsetspec.generators.pullrequest.template.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"chart","directory","helm","kustomize","path","plugin","ref","repoURL","targetRevision"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Source implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("chart")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String chart;

    public String getChart() {
        return chart;
    }

    public void setChart(String chart) {
        this.chart = chart;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("directory")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.pullrequest.template.spec.source.Directory directory;

    public io.argoproj.v1alpha1.applicationsetspec.generators.pullrequest.template.spec.source.Directory getDirectory() {
        return directory;
    }

    public void setDirectory(io.argoproj.v1alpha1.applicationsetspec.generators.pullrequest.template.spec.source.Directory directory) {
        this.directory = directory;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("helm")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.pullrequest.template.spec.source.Helm helm;

    public io.argoproj.v1alpha1.applicationsetspec.generators.pullrequest.template.spec.source.Helm getHelm() {
        return helm;
    }

    public void setHelm(io.argoproj.v1alpha1.applicationsetspec.generators.pullrequest.template.spec.source.Helm helm) {
        this.helm = helm;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("kustomize")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.pullrequest.template.spec.source.Kustomize kustomize;

    public io.argoproj.v1alpha1.applicationsetspec.generators.pullrequest.template.spec.source.Kustomize getKustomize() {
        return kustomize;
    }

    public void setKustomize(io.argoproj.v1alpha1.applicationsetspec.generators.pullrequest.template.spec.source.Kustomize kustomize) {
        this.kustomize = kustomize;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("path")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("plugin")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.pullrequest.template.spec.source.Plugin plugin;

    public io.argoproj.v1alpha1.applicationsetspec.generators.pullrequest.template.spec.source.Plugin getPlugin() {
        return plugin;
    }

    public void setPlugin(io.argoproj.v1alpha1.applicationsetspec.generators.pullrequest.template.spec.source.Plugin plugin) {
        this.plugin = plugin;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ref")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String ref;

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("repoURL")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String repoURL;

    public String getRepoURL() {
        return repoURL;
    }

    public void setRepoURL(String repoURL) {
        this.repoURL = repoURL;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("targetRevision")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String targetRevision;

    public String getTargetRevision() {
        return targetRevision;
    }

    public void setTargetRevision(String targetRevision) {
        this.targetRevision = targetRevision;
    }
}

