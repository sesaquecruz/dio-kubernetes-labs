#!/bin/bash

echo ">> Backend:"

echo ">> Building app..."
gradle clean -p app/
gradle build -p app/

echo ">> Creating docker image..."
docker build . -t sesaquecruz/lab-2-backend:1.0

echo ">> Pushing docker image..."
docker push sesaquecruz/lab-2-backend:1.0