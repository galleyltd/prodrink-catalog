#!/bin/bash
docker login -u="$DOCKER_USERNAME" -p="$DOCKER_PASSWORD"
docker tag $IMAGE_PATH:latest $IMAGE_PATH:$VERSION
docker push $IMAGE_PATH:$VERSION
docker push $IMAGE_PATH:latest
