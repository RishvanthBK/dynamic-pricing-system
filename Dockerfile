# Build stage
FROM maven:3.9.6-eclipse-temurin-17 AS build

WORKDIR /app
COPY . .
RUN mvn clean package

# Run stage
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app
COPY --from=build /app/target/dynamic-pricing-system.jar app.jar

CMD ["java", "-jar", "app.jar"]