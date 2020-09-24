FROM openjdk

WORKDIR /app

COPY config-server/target/config-server-0.0.1-SNAPSHOT.jar /app/config-server.jar

ENTRYPOINT ["java", "-jar", "config-server.jar"]

EXPOSE 8888