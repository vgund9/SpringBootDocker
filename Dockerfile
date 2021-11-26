FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8082
#COPY --from=build /usr/src/app/target/*.jar app.jar
ADD target/*.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]

