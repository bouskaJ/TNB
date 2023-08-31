package io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.list.template.spec.source;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"fileParameters","ignoreMissingValueFiles","parameters","passCredentials","releaseName","skipCrds","valueFiles","values","valuesObject","version"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Helm implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("fileParameters")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.list.template.spec.source.helm.FileParameters> fileParameters;

    public java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.list.template.spec.source.helm.FileParameters> getFileParameters() {
        return fileParameters;
    }

    public void setFileParameters(java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.list.template.spec.source.helm.FileParameters> fileParameters) {
        this.fileParameters = fileParameters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ignoreMissingValueFiles")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean ignoreMissingValueFiles;

    public Boolean getIgnoreMissingValueFiles() {
        return ignoreMissingValueFiles;
    }

    public void setIgnoreMissingValueFiles(Boolean ignoreMissingValueFiles) {
        this.ignoreMissingValueFiles = ignoreMissingValueFiles;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.list.template.spec.source.helm.Parameters> parameters;

    public java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.list.template.spec.source.helm.Parameters> getParameters() {
        return parameters;
    }

    public void setParameters(java.util.List<io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.list.template.spec.source.helm.Parameters> parameters) {
        this.parameters = parameters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("passCredentials")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean passCredentials;

    public Boolean getPassCredentials() {
        return passCredentials;
    }

    public void setPassCredentials(Boolean passCredentials) {
        this.passCredentials = passCredentials;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("releaseName")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String releaseName;

    public String getReleaseName() {
        return releaseName;
    }

    public void setReleaseName(String releaseName) {
        this.releaseName = releaseName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("skipCrds")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean skipCrds;

    public Boolean getSkipCrds() {
        return skipCrds;
    }

    public void setSkipCrds(Boolean skipCrds) {
        this.skipCrds = skipCrds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("valueFiles")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> valueFiles;

    public java.util.List<String> getValueFiles() {
        return valueFiles;
    }

    public void setValueFiles(java.util.List<String> valueFiles) {
        this.valueFiles = valueFiles;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("values")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String values;

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("valuesObject")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.list.template.spec.source.helm.ValuesObject valuesObject;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.list.template.spec.source.helm.ValuesObject getValuesObject() {
        return valuesObject;
    }

    public void setValuesObject(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.list.template.spec.source.helm.ValuesObject valuesObject) {
        this.valuesObject = valuesObject;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("version")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}

