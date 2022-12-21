FROM adoptopenjdk/openjdk11:ubi
COPY build/libs/*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]