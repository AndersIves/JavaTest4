#!/usr/bin/env bash
echo -e "\033[31m #insert into film inf\033[0m"
Id=$(curl -s -X POST -d "title=inserttitle&languageId=1" "http://localhost:18080/film/insert")
echo "insert over"

echo -e "\033[31m #login by using correct inf\033[0m"
status=$(curl -s -X POST -d "name=MARY&password=SMITH" "http://localhost:18080/customer/login")
echo "$status"

echo -e "\033[31m #login by using incorrect inf\033[0m"
status=$(curl -s -X POST -d "name=asd&password=dsa" "http://localhost:18080/customer/login")
echo "$status"


echo -e "\033[31m #select film by pageSize=2 page=1\033[0m"
data=$(curl -s -X GET -d "pageSize=2&page=1" "http://localhost:18080/film/")
echo "data = $data "


echo -e "\033[31m #insert into customer addressId=99999\033[0m"
Id1=$(curl -s -X POST -d "storeId=1&firstName=a&lastName=b&email=insert@email.com&addressId=99999&createDate=2000-01-01 00:00:00" "http://localhost:18080/customer/insert")
echo "return id=$Id1 ,-1 means insert failed"


echo -e "\033[31m #insert into customer addressId=1\033[0m"
Id2=$(curl -s -X POST -d "storeId=1&firstName=a&lastName=b&email=insert@email.com&addressId=1&createDate=2000-01-01 00:00:00" "http://localhost:18080/customer/insert")
echo "return id=$Id2 ,not -1 means insert succeed"


echo -e "\033[31m #update customer $Id2\033[0m"
data=$(curl -s -X PUT -d "customerId=$Id2&storeId=1&firstName=ccc&lastName=ccc&email=insert@email.com&addressId=1&createDate=2000-01-01 00:00:00" "http://localhost:18080/customer/update")
echo "data = $data"


echo -e "\033[31m #delete customer $Id2\033[0m"
curl -s -X DELETE -d "id=$Id2" "http://localhost:18080/customer/delete"
echo "delete over"