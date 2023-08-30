package io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.bitbucket;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"tokenRef"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class BearerToken implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("tokenRef")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.bitbucket.bearertoken.TokenRef tokenRef;

    public io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.bitbucket.bearertoken.TokenRef getTokenRef() {
        return tokenRef;
    }

    public void setTokenRef(io.argoproj.v1alpha1.applicationsetspec.generators.merge.generators.pullrequest.bitbucket.bearertoken.TokenRef tokenRef) {
        this.tokenRef = tokenRef;
    }
}

