# DropwizardDockerMaven

How to start the DropwizardDockerMaven application
--------------------------------------------------

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/DropwizardDockerMaven-1.0-SNAPSHOT.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`

Health Check
------------

To see your applications health enter url `http://localhost:8081/healthcheck`

Run in Docker
-------------
```bash
docker build -t dropwizarddocker . && docker run -p 8080:8080 -t dropwizarddocker
```