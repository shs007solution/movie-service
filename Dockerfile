FROM adoptopenjdk/openjdk11:ubi
COPY build/libs/s-1.0.0.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]