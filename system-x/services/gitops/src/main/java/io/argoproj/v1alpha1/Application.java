package io.argoproj.v1alpha1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1alpha1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("argoproj.io")
@io.fabric8.kubernetes.model.annotation.Singular("application")
@io.fabric8.kubernetes.model.annotation.Plural("applications")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Application extends io.fabric8.kubernetes.client.CustomResource<io.argoproj.v1alpha1.ApplicationSpec, io.argoproj.v1alpha1.ApplicationStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}

