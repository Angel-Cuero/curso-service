FROM openjdk:23
LABEL authors="topG"
WORKDIR /app
COPY target/curso-service-0.0.1-SNAPSHOT.jar /app
ENTRYPOINT ["java", "-jar", "curso-service-0.0.1-SNAPSHOT.jar"]