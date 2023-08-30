package io.argoproj.v1alpha1.applicationstatus.operationstate.operation;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"backoff","limit"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Retry implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Backoff controls how to backoff on subsequent retries of failed syncs
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backoff")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Backoff controls how to backoff on subsequent retries of failed syncs")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationstatus.operationstate.operation.retry.Backoff backoff;

    public io.argoproj.v1alpha1.applicationstatus.operationstate.operation.retry.Backoff getBackoff() {
        return backoff;
    }

    public void setBackoff(io.argoproj.v1alpha1.applicationstatus.operationstate.operation.retry.Backoff backoff) {
        this.backoff = backoff;
    }

    /**
     * Limit is the maximum number of attempts for retrying a failed sync. If set to 0, no retries will be performed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("limit")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Limit is the maximum number of attempts for retrying a failed sync. If set to 0, no retries will be performed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long limit;

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }
}

