FROM openjdk:8
EXPOSE 8085
ADD target/docker-jenkins-integration.jar docker-jenkins-integration.jar
ENTRYPOINT ["java", "-jar", "/docker-jenkins-integration.jar"]
