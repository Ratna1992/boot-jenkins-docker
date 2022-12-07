FROM openjdk:8
EXPOSE 9876
ADD target/boot-jenkins-docker.jar boot-jenkins-docker.jar
ENTRYPOINT["java","-jar","boot-jenkins-docker.jar"]