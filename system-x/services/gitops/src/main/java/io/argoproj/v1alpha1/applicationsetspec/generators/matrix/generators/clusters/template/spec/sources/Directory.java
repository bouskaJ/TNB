package io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.clusters.template.spec.sources;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"exclude","include","jsonnet","recurse"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Directory implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("exclude")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String exclude;

    public String getExclude() {
        return exclude;
    }

    public void setExclude(String exclude) {
        this.exclude = exclude;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("include")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String include;

    public String getInclude() {
        return include;
    }

    public void setInclude(String include) {
        this.include = include;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("jsonnet")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.clusters.template.spec.sources.directory.Jsonnet jsonnet;

    public io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.clusters.template.spec.sources.directory.Jsonnet getJsonnet() {
        return jsonnet;
    }

    public void setJsonnet(io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.clusters.template.spec.sources.directory.Jsonnet jsonnet) {
        this.jsonnet = jsonnet;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("recurse")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean recurse;

    public Boolean getRecurse() {
        return recurse;
    }

    public void setRecurse(Boolean recurse) {
        this.recurse = recurse;
    }
}

