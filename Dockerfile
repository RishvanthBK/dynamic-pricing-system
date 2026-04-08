FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY . .
RUN ./mvnw clean package
CMD ["java", "-cp", "target/dynamic-pricing-system.jar", "App"]