#!/bin/bash

echo ">> Database:"

echo ">> Creating docker image..."
docker build . -t sesaquecruz/lab-1-database:1.0

echo ">> Pushing docker image..."
docker push sesaquecruz/lab-1-database:1.0