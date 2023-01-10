#!/bin/bash

echo ">> Frontend:"

echo ">> Building app..."
rm -r app/build
npm run build --prefix app/

echo ">> Creating docker image..."
docker build . -t sesaquecruz/lab-1-frontend:1.0

echo ">> Pushing docker image..."
docker push sesaquecruz/lab-1-frontend:1.0