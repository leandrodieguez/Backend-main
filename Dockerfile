FROM amazoncorretto:11-alpine-jdk
MAINTAINER LD
COPY target/ld-0.0.1-SNAPSHOT.jar ld-app.jar
ENTRYPOINT ["java","-jar","/ld-app.jar"]
