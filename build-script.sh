#!/bin/bash
if [ "$TRAVIS_BRANCH" == "master" ] && [ "$TRAVIS_PULL_REQUEST" = "false" ] ; then
   export IMAGE_PATH=prodrink/prodrink-catalog
   export VERSION=`cat VERSION`.$TRAVIS_BUILD_NUMBER
   docker build -t $IMAGE_PATH:$VERSION .
   ./docker-push.sh
else
   ./gradlew build
fi
