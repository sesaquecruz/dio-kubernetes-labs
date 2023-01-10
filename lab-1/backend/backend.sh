#!/bin/bash

echo ">> Backend:"

echo ">> Building app..."
gradle clean -p app/
gradle build -p app/

echo ">> Creating docker image..."
docker build . -t sesaquecruz/lab-1-backend:1.0

echo ">> Pushing docker image..."
docker push sesaquecruz/lab-1-backend:1.0