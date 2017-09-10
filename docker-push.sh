#!/bin/bash
docker login -u="$DOCKER_USERNAME" -p="$DOCKER_PASSWORD"
docker tag $IMAGE_PATH:$VERSION
docker tag $IMAGE_PATH:latest
docker push $IMAGE_PATH:$VERSION
