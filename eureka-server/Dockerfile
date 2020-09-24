FROM openjdk

WORKDIR /app

COPY eureka-server/target/eureka-server-0.0.1-SNAPSHOT.jar /app/eureka-server.jar

ENTRYPOINT ["java", "-jar", "eureka-server.jar"]

EXPOSE 8761