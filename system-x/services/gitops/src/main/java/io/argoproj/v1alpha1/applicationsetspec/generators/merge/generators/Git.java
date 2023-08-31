package io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"directories","files","pathParamPrefix","repoURL","requeueAfterSeconds","revision","template","values"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Git implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("directories")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.git.Directories> directories;

    public java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.git.Directories> getDirectories() {
        return directories;
    }

    public void setDirectories(java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.git.Directories> directories) {
        this.directories = directories;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("files")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.git.Files> files;

    public java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.git.Files> getFiles() {
        return files;
    }

    public void setFiles(java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.git.Files> files) {
        this.files = files;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("pathParamPrefix")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String pathParamPrefix;

    public String getPathParamPrefix() {
        return pathParamPrefix;
    }

    public void setPathParamPrefix(String pathParamPrefix) {
        this.pathParamPrefix = pathParamPrefix;
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

    @com.fasterxml.jackson.annotation.JsonProperty("requeueAfterSeconds")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long requeueAfterSeconds;

    public Long getRequeueAfterSeconds() {
        return requeueAfterSeconds;
    }

    public void setRequeueAfterSeconds(Long requeueAfterSeconds) {
        this.requeueAfterSeconds = requeueAfterSeconds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("revision")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String revision;

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("template")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.git.Template template;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.git.Template getTemplate() {
        return template;
    }

    public void setTemplate(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.git.Template template) {
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

