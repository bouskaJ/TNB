package io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.clusterdecisionresource.template.spec.syncpolicy;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"backoff","limit"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Retry implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("backoff")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.clusterdecisionresource.template.spec.syncpolicy.retry.Backoff backoff;

    public io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.clusterdecisionresource.template.spec.syncpolicy.retry.Backoff getBackoff() {
        return backoff;
    }

    public void setBackoff(io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.clusterdecisionresource.template.spec.syncpolicy.retry.Backoff backoff) {
        this.backoff = backoff;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("limit")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long limit;

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }
}

