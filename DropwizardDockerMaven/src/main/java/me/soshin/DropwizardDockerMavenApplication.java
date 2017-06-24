package me.soshin;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DropwizardDockerMavenApplication extends Application<DropwizardDockerMavenConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DropwizardDockerMavenApplication().run(args);
    }

    @Override
    public String getName() {
        return "DropwizardDockerMaven";
    }

    @Override
    public void initialize(final Bootstrap<DropwizardDockerMavenConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DropwizardDockerMavenConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
