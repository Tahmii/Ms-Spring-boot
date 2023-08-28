FROM openjdk:17-slim-buster as build

WORKDIR /app

COPY target/ms-sb-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
