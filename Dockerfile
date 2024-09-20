# Use an official OpenJDK 21 runtime as a parent image
FROM eclipse-temurin:21-jdk-alpine
COPY wait-for-db-start.sh /usr/local/bin/wait-for-db-start.sh
RUN chmod +x /usr/local/bin/wait-for-db-start.sh

RUN apk update && apk add mariadb-client && apk add mariadb-connector-c

# Set the working directory in the container
WORKDIR /app

LABEL org.opencontainers.image.source=https://github.com/MAtt5816/spring-api-server

# Copy the JAR file from the target directory to the container
COPY target/*.jar app.jar

# Expose the port that your Spring Boot app will run on
EXPOSE 8080

# Set the environment variable to tell Spring Boot to use the default profile
ENV JAVA_OPTS=""

# Run the Spring Boot application
ENTRYPOINT ["sh", "-c", "wait-for-db-start.sh -- java $JAVA_OPTS -jar app.jar"]

