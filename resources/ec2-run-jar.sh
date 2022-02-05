#!/usr/bin/env bash

sudo kill -9 $(sudo lsof -t -i:8080)
echo "Killed process running on port 8080"

# TWEAK JAR NAME FOR GRADLE BUILDS
java -jar kentarus-0.0.1-SNAPSHOT.jar
echo "Started server using java -jar command"