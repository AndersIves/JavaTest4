#!/usr/bin/env bash
echo -e "\033[31m ==========================package==========================\033[0m"
cd ./Exam1
mvn package -DskipTests
cd ../

echo -e "\033[31m ==========================cp==========================\033[0m"
rm -f ./docker/java/app.jar
cp -f ./Exam1/target/*.jar ./docker/java/app.jar

echo -e "\033[31m ==========================create log==========================\033[0m"
touch exam1.log

echo -e "\033[31m ==========================build==========================\033[0m"
docker-compose build