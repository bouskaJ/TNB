package software.tnb.product.cq.application;

import software.tnb.common.config.OpenshiftConfiguration;
import software.tnb.common.config.TestConfiguration;
import software.tnb.product.application.App;
import software.tnb.product.application.Phase;
import software.tnb.product.cq.configuration.QuarkusConfiguration;
import software.tnb.product.integration.builder.AbstractIntegrationBuilder;
import software.tnb.product.integration.generator.IntegrationGenerator;
import software.tnb.product.log.stream.LogStream;
import software.tnb.product.util.maven.BuildRequest;
import software.tnb.product.util.maven.Maven;

import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class QuarkusApp extends App {
    private static final Logger LOG = LoggerFactory.getLogger(QuarkusApp.class);

    public QuarkusApp(AbstractIntegrationBuilder<?> integrationBuilder) {
        super(integrationBuilder.getIntegrationName());
        LOG.info("Creating Camel Quarkus application project for integration {}", name);

        String quarkusMavenPluginCreate = String.format("%s:%s:%s:create",
            QuarkusConfiguration.mavenPluginGroupId(), QuarkusConfiguration.mavenPluginArtifactId(), QuarkusConfiguration.mavenPluginVersion());

        Maven.invoke(new BuildRequest.Builder()
            .withBaseDirectory(TestConfiguration.appLocation())
            .withGoals(quarkusMavenPluginCreate)
            .withProperties(Map.of(
                "projectGroupId", TestConfiguration.appGroupId(),
                "projectArtifactId", name,
                "platformGroupId", QuarkusConfiguration.quarkusPlatformGroupId(),
                "platformArtifactId", QuarkusConfiguration.quarkusPlatformArtifactId(),
                "platformVersion", QuarkusConfiguration.quarkusVersion(),
                "extensions", OpenshiftConfiguration.isOpenshift() ? "openshift" : ""
            ))
            .withLogFile(getLogPath(Phase.GENERATE))
            .withLogMarker(LogStream.marker(name, Phase.GENERATE))
            .build()
        );

        IntegrationGenerator.toFile(integrationBuilder, TestConfiguration.appLocation().resolve(name));

        customizeProject(integrationBuilder.getDependencies());
        customizePlugins(integrationBuilder.getPlugins());

        BuildRequest.Builder requestBuilder = new BuildRequest.Builder()
            .withBaseDirectory(TestConfiguration.appLocation().resolve(name))
            .withGoals("clean", "package")
            .withProperties(Map.of(
                "skipTests", "true",
                "quarkus.native.container-build", "true"
            ))
            .withLogFile(getLogPath(Phase.BUILD))
            .withLogMarker(LogStream.marker(name, Phase.BUILD));
        if (QuarkusConfiguration.isQuarkusNative() && !OpenshiftConfiguration.isOpenshift()) {
            // Native build is performed in the OCP deploy, this build is just for fetching dependencies
            requestBuilder.withProfiles("native");
        }

        LOG.info("Building {} application project ({})", name, QuarkusConfiguration.isQuarkusNative() ? "native" : "JVM");
        Maven.invoke(requestBuilder.build());
    }

    /**
     * Customizes the project generated by quarkus mvn plugin to TNB app needs.
     *
     * @param dependencies dependencies to add to the project
     */
    private void customizeProject(List<Dependency> dependencies) {
        // Remove the GreetingResource.java file that is not used
        final File greetingResource = TestConfiguration.appLocation().resolve(name)
            .resolve("src/main/java/" + TestConfiguration.appGroupId().replace(".", "/") + "/GreetingResource.java").toFile();
        if (greetingResource.exists()) {
            greetingResource.delete();
        }

        File pom = TestConfiguration.appLocation().resolve(name).resolve("pom.xml").toFile();
        Model model = Maven.loadPom(pom);

        // Append the camel platform bom (quarkus bom already present)
        Dependency camelQuarkusBom = new Dependency();
        camelQuarkusBom.setGroupId(QuarkusConfiguration.camelPlatformGroupId());
        camelQuarkusBom.setArtifactId(QuarkusConfiguration.camelPlatformArtifactId());
        camelQuarkusBom.setVersion(QuarkusConfiguration.camelQuarkusVersion());
        camelQuarkusBom.setType("pom");
        camelQuarkusBom.setScope("import");
        model.getDependencyManagement().getDependencies().add(camelQuarkusBom);

        if (!OpenshiftConfiguration.isOpenshift()) {
            // quarkus-resteasy is needed for the openshift.yml to be generated, but the resteasy itself is not used anywhere
            // remove quarkus-resteasy in local deployments as it can throw exceptions for occupied 8080 port
            model.setDependencies(
                model.getDependencies().stream().filter(d -> !"quarkus-resteasy".equals(d.getArtifactId())).collect(Collectors.toList())
            );
        }

        dependencies.forEach(model.getDependencies()::add);

        Maven.writePom(pom, model);
    }
}
