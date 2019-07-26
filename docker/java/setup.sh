#!/bin/bash
#while ! nc -z ${MYSQL_IP} ${MYSQL_PORT}; do sleep 3; done;
#echo "${MYSQL_IP}:${MYSQL_PORT}"

while ! nc -z ${MYSQL_IP} ${MYSQL_PORT};do sleep 3; echo "sleep"; done;
echo "done";
echo "${MYSQL_IP}:${MYSQL_PORT}";
java -jar /app.jar;