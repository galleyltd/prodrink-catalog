#!/bin/bash
docker login -u="$DOCKER_USERNAME" -p="$DOCKER_PASSWORD"
docker tag $ORG_NAME/$IMAGE:latest $ORG_NAME/$IMAGE:$VERSION
docker push $ORG_NAME/$IMAGE:latest
docker push $ORG_NAME/$IMAGE:$VERSION
