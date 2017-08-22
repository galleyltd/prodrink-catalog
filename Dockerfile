FROM openjdk:8u131-jre-alpine
VOLUME /tmp
ADD ./build/libs/catalog-service-0.0.1.jar /app.jar
EXPOSE 8080
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xmx512m", "-jar", "/app.jar"]
LABEL maintainer="perikov.igor@gmail.com"
