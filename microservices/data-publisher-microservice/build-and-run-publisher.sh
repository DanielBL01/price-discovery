#!/bin/zsh

docker build -t data-publisher .

docker run data-publisher
