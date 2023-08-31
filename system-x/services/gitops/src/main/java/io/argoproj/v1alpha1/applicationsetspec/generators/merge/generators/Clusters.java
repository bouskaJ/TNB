package io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"selector","template","values"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Clusters implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("selector")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.clusters.Selector selector;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.clusters.Selector getSelector() {
        return selector;
    }

    public void setSelector(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.clusters.Selector selector) {
        this.selector = selector;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("template")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.clusters.Template template;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.clusters.Template getTemplate() {
        return template;
    }

    public void setTemplate(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.clusters.Template template) {
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

