FROM adoptopenjdk/openjdk11:ubi
COPY build/libs/movie-service-1.0.0.jar /movie-service-1.0.0.jar
ENTRYPOINT ["java","-jar","/movie-service-1.0.0.jar"]