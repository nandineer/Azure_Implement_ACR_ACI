FROM openjdk:17-jdk-slim
ADD target/dockerapp-0.0.1-SNAPSHOT.jar  dockerapp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","dockerapp-0.0.1-SNAPSHOT.jar"]