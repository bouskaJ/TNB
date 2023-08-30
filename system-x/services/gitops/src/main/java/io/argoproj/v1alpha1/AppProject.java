package io.argoproj.v1alpha1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1alpha1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("argoproj.io")
@io.fabric8.kubernetes.model.annotation.Singular("appproject")
@io.fabric8.kubernetes.model.annotation.Plural("appprojects")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class AppProject extends io.fabric8.kubernetes.client.CustomResource<io.argoproj.v1alpha1.AppProjectSpec, io.argoproj.v1alpha1.AppProjectStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}

