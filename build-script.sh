#!/bin/bash
./gradlew build
export ORG_NAME=prodrink
export IMAGE=prodrink-catalog
export VERSION=`cat VERSION`.$TRAVIS_BUILD_NUMBER
docker build -t $ORG_NAME/$IMAGE:latest .
if [ "$TRAVIS_BRANCH" == "master" ] && [ "$TRAVIS_PULL_REQUEST" = "false" ] ; then
   ./docker-push.sh
fi
