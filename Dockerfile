FROM openjdk:8u131-jre-alpine
VOLUME /tmp
ADD ./build/libs/catalog-service-0.0.1.jar /app.jar
ENV GRPC_PORT=8090
EXPOSE ${GRPC_PORT}
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xmx512m", "-jar", "/app.jar"]
LABEL maintainer="perikov.igor@gmail.com"
