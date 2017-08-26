#!/bin/bash
if [ "$TRAVIS_BRANCH" == "master" ]; then
   docker build -t prodrink/prodrink-catalog .
else
   ./gradlew build
fi
