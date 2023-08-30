package io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.pullrequest.bitbucketserver;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"passwordRef","username"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class BasicAuth implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("passwordRef")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.pullrequest.bitbucketserver.basicauth.PasswordRef passwordRef;

    public io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.pullrequest.bitbucketserver.basicauth.PasswordRef getPasswordRef() {
        return passwordRef;
    }

    public void setPasswordRef(io.argoproj.v1alpha1.applicationsetspec.generators.matrix.generators.pullrequest.bitbucketserver.basicauth.PasswordRef passwordRef) {
        this.passwordRef = passwordRef;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("username")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

