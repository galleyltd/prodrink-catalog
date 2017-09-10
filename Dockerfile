FROM openjdk:8u131-jdk-alpine AS BUILD_IMAGE
USER root
ENV APP_HOME=/root/dev/catalog
RUN mkdir -p $APP_HOME
COPY . $APP_HOME
WORKDIR $APP_HOME
RUN ./gradlew build -x generateProto

FROM openjdk:8u131-jre-alpine
WORKDIR /root/dev/catalog
COPY --from=BUILD_IMAGE /root/dev/catalog/build/libs/catalog-service.jar .
EXPOSE 8080
CMD ["java", "-Xmx512m", "-jar", "catalog-service.jar"]
