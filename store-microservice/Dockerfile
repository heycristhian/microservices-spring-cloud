FROM openjdk

WORKDIR /app

COPY target/store-microservice-0.0.1-SNAPSHOT.jar /app/store-microservice.jar

ENTRYPOINT ["java", "-jar", "store-microservice.jar"]

EXPOSE 8080