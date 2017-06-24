FROM maven:3.5-jdk-8

COPY ./ ./
EXPOSE 8080
RUN mvn clean install
ENTRYPOINT ["java", "-jar", "target/DropwizardDockerMaven-1.0-SNAPSHOT.jar", "server", "config.yml"]