#!/bin/bash
version=`cat VERSION`
docker login -u="$DOCKER_USERNAME" -p="$DOCKER_PASSWORD"
docker push prodrink/prodrink-catalog:$version.$TRAVIS_BUILD_NUMBER
