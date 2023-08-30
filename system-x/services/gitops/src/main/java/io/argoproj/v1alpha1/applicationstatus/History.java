package io.argoproj.v1alpha1.applicationstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"deployStartedAt","deployedAt","id","revision","revisions","source","sources"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class History implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * DeployStartedAt holds the time the sync operation started
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deployStartedAt")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DeployStartedAt holds the time the sync operation started")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.time.ZonedDateTime deployStartedAt;

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssVV")
    public java.time.ZonedDateTime getDeployStartedAt() {
        return deployStartedAt;
    }

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss[XXX][VV]")
    public void setDeployStartedAt(java.time.ZonedDateTime deployStartedAt) {
        this.deployStartedAt = deployStartedAt;
    }

    /**
     * DeployedAt holds the time the sync operation completed
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deployedAt")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DeployedAt holds the time the sync operation completed")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.time.ZonedDateTime deployedAt;

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssVV")
    public java.time.ZonedDateTime getDeployedAt() {
        return deployedAt;
    }

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss[XXX][VV]")
    public void setDeployedAt(java.time.ZonedDateTime deployedAt) {
        this.deployedAt = deployedAt;
    }

    /**
     * ID is an auto incrementing identifier of the RevisionHistory
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ID is an auto incrementing identifier of the RevisionHistory")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Revision holds the revision the sync was performed against
     */
    @com.fasterxml.jackson.annotation.JsonProperty("revision")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Revision holds the revision the sync was performed against")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String revision;

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * Revisions holds the revision of each source in sources field the sync was performed against
     */
    @com.fasterxml.jackson.annotation.JsonProperty("revisions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Revisions holds the revision of each source in sources field the sync was performed against")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> revisions;

    public java.util.List<String> getRevisions() {
        return revisions;
    }

    public void setRevisions(java.util.List<String> revisions) {
        this.revisions = revisions;
    }

    /**
     * Source is a reference to the application source used for the sync operation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Source is a reference to the application source used for the sync operation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationstatus.history.Source source;

    public io.argoproj.v1alpha1.applicationstatus.history.Source getSource() {
        return source;
    }

    public void setSource(io.argoproj.v1alpha1.applicationstatus.history.Source source) {
        this.source = source;
    }

    /**
     * Sources is a reference to the application sources used for the sync operation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Sources is a reference to the application sources used for the sync operation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.argoproj.v1alpha1.applicationstatus.history.Sources> sources;

    public java.util.List<io.argoproj.v1alpha1.applicationstatus.history.Sources> getSources() {
        return sources;
    }

    public void setSources(java.util.List<io.argoproj.v1alpha1.applicationstatus.history.Sources> sources) {
        this.sources = sources;
    }
}

