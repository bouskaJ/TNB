package io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.git;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"metadata","spec"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Template implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.git.template.Metadata metadata;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.git.template.Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.git.template.Metadata metadata) {
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("spec")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.git.template.Spec spec;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.git.template.Spec getSpec() {
        return spec;
    }

    public void setSpec(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.git.template.Spec spec) {
        this.spec = spec;
    }
}

