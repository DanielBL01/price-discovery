# Base image 
FROM eclipse-temurin:17
# Create dir in container 
RUN mkdir /opt/app
# Copy jar build to container
COPY target/data-consumer-microservice-0.0.1-SNAPSHOT.jar /opt/app/app.jar
# Define commands to run in container
ENTRYPOINT ["java","-jar","/opt/app/app.jar"]
