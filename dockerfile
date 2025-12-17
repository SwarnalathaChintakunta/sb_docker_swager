# Use Java 17 runtime image
FROM eclipse-temurin:17-jre-alpine

# Create app directory
WORKDIR /app

# Copy jar file into container
COPY target/*.jar sb_docker_swager.jar

# Expose port (optional)
EXPOSE 8080

# Run jar
ENTRYPOINT ["java", "-jar", "sb_docker_swager.jar"]