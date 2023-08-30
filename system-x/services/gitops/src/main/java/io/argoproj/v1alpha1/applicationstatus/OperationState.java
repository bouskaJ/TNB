package io.argoproj.v1alpha1.applicationstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"finishedAt","message","operation","phase","retryCount","startedAt","syncResult"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class OperationState implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * FinishedAt contains time of operation completion
     */
    @com.fasterxml.jackson.annotation.JsonProperty("finishedAt")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("FinishedAt contains time of operation completion")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.time.ZonedDateTime finishedAt;

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssVV")
    public java.time.ZonedDateTime getFinishedAt() {
        return finishedAt;
    }

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss[XXX][VV]")
    public void setFinishedAt(java.time.ZonedDateTime finishedAt) {
        this.finishedAt = finishedAt;
    }

    /**
     * Message holds any pertinent messages when attempting to perform operation (typically errors).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Message holds any pertinent messages when attempting to perform operation (typically errors).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Operation is the original requested operation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Operation is the original requested operation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationstatus.operationstate.Operation operation;

    public io.argoproj.v1alpha1.applicationstatus.operationstate.Operation getOperation() {
        return operation;
    }

    public void setOperation(io.argoproj.v1alpha1.applicationstatus.operationstate.Operation operation) {
        this.operation = operation;
    }

    /**
     * Phase is the current phase of the operation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Phase is the current phase of the operation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * RetryCount contains time of operation retries
     */
    @com.fasterxml.jackson.annotation.JsonProperty("retryCount")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RetryCount contains time of operation retries")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long retryCount;

    public Long getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(Long retryCount) {
        this.retryCount = retryCount;
    }

    /**
     * StartedAt contains time of operation start
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startedAt")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("StartedAt contains time of operation start")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.time.ZonedDateTime startedAt;

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssVV")
    public java.time.ZonedDateTime getStartedAt() {
        return startedAt;
    }

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss[XXX][VV]")
    public void setStartedAt(java.time.ZonedDateTime startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * SyncResult is the result of a Sync operation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("syncResult")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SyncResult is the result of a Sync operation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationstatus.operationstate.SyncResult syncResult;

    public io.argoproj.v1alpha1.applicationstatus.operationstate.SyncResult getSyncResult() {
        return syncResult;
    }

    public void setSyncResult(io.argoproj.v1alpha1.applicationstatus.operationstate.SyncResult syncResult) {
        this.syncResult = syncResult;
    }
}

