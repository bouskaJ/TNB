package io.argoproj.v1alpha1.applicationsetspec.generators;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"elements","elementsYaml","template"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class List implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("elements")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.fabric8.kubernetes.api.model.AnyType> elements;

    public java.util.List<io.fabric8.kubernetes.api.model.AnyType> getElements() {
        return elements;
    }

    public void setElements(java.util.List<io.fabric8.kubernetes.api.model.AnyType> elements) {
        this.elements = elements;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("elementsYaml")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String elementsYaml;

    public String getElementsYaml() {
        return elementsYaml;
    }

    public void setElementsYaml(String elementsYaml) {
        this.elementsYaml = elementsYaml;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("template")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.list.Template template;

    public io.argoproj.v1alpha1.applicationsetspec.generators.list.Template getTemplate() {
        return template;
    }

    public void setTemplate(io.argoproj.v1alpha1.applicationsetspec.generators.list.Template template) {
        this.template = template;
    }
}

