FROM openjdk

WORKDIR /app

COPY target/provider-microservice-0.0.1-SNAPSHOT.jar /app/provider-microservice.jar

ENTRYPOINT ["java", "-jar", "provider-microservice.jar"]

EXPOSE 8081