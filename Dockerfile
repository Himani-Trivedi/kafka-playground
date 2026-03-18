FROM eclipse-temurin:21-jdk-jammy

WORKDIR /app

COPY target/*.jar app.jar

EXPOSE 8081

# Set default environment variables
ENV SERVER_PORT=8081
ENV KAFKA_BOOTSTRAP_SERVERS=localhost:29093,localhost:29092

ENTRYPOINT ["java","-jar","app.jar","--spring.profiles.active=docker"]