FROM openjdk:8
EXPOSE 8282
ADD target/assignment-ui-0.0.1-SNAPSHOT.jar assignment-ui.jar
ENTRYPOINT ["java","-jar","assignment-ui.jar","--server.port=8282"]