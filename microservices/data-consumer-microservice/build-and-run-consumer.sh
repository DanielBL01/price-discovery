#!/bin/zsh

docker build -t data-consumer .

docker run data-consumer
