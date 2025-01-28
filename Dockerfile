# Build stage
FROM maven:3.8.4-openjdk-11 AS build
WORKDIR /app
COPY . .
RUN mvn clean package

# Runtime stage
FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=build /app/target/my-app-1.0.0.jar ./my-app.jar
EXPOSE 8080
CMD ["java", "-jar", "my-app.jar"]