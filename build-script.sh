#!/bin/bash
if [ "$TRAVIS_BRANCH" == "master" ] && [ "$TRAVIS_PULL_REQUEST" = "false" ] ; then
   docker build -t prodrink/prodrink-catalog .
else
   ./gradlew build
fi
