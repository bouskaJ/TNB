package io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.git.template;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"destination","ignoreDifferences","info","project","revisionHistoryLimit","source","sources","syncPolicy"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Spec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.git.template.spec.Destination destination;

    public io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.git.template.spec.Destination getDestination() {
        return destination;
    }

    public void setDestination(io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.git.template.spec.Destination destination) {
        this.destination = destination;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ignoreDifferences")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.git.template.spec.IgnoreDifferences> ignoreDifferences;

    public java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.git.template.spec.IgnoreDifferences> getIgnoreDifferences() {
        return ignoreDifferences;
    }

    public void setIgnoreDifferences(java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.git.template.spec.IgnoreDifferences> ignoreDifferences) {
        this.ignoreDifferences = ignoreDifferences;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("info")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.git.template.spec.Info> info;

    public java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.git.template.spec.Info> getInfo() {
        return info;
    }

    public void setInfo(java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.git.template.spec.Info> info) {
        this.info = info;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("project")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String project;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("revisionHistoryLimit")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long revisionHistoryLimit;

    public Long getRevisionHistoryLimit() {
        return revisionHistoryLimit;
    }

    public void setRevisionHistoryLimit(Long revisionHistoryLimit) {
        this.revisionHistoryLimit = revisionHistoryLimit;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("source")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.git.template.spec.Source source;

    public io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.git.template.spec.Source getSource() {
        return source;
    }

    public void setSource(io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.git.template.spec.Source source) {
        this.source = source;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.git.template.spec.Sources> sources;

    public java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.git.template.spec.Sources> getSources() {
        return sources;
    }

    public void setSources(java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.git.template.spec.Sources> sources) {
        this.sources = sources;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("syncPolicy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.git.template.spec.SyncPolicy syncPolicy;

    public io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.git.template.spec.SyncPolicy getSyncPolicy() {
        return syncPolicy;
    }

    public void setSyncPolicy(io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.git.template.spec.SyncPolicy syncPolicy) {
        this.syncPolicy = syncPolicy;
    }
}

