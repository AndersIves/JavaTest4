#!/usr/bin/env bash
echo -e "\033[31m #insert into film inf\033[0m"
Id=$(curl -H "Content-Type: application/json" -s -X POST -d '{"title":"inserttitle","languageId":1}' "http://localhost:18080/film/")
echo "insert over $Id"

echo -e "\033[31m #login by using correct inf\033[0m"
status=$(curl -s -X POST -d "name=MARY&password=SMITH" "http://localhost:18080/customer/login/")
echo "$status"

echo -e "\033[31m #login by using incorrect inf\033[0m"
status=$(curl -s -X POST -d "name=asd&password=dsa" "http://localhost:18080/customer/login/")
echo "$status"


echo -e "\033[31m #select film by pageSize=2 page=1\033[0m"
data=$(curl -s "http://localhost:18080/film/?pageSize=2&page=1")
echo "data = $data "


echo -e "\033[31m #insert into customer addressId=99999\033[0m"
Id1=$(curl -H "Content-Type: application/json" -s -X POST -d '{"storeId":1,"firstName":"aaa","lastName":"aaa","email":"insert@email.com","addressId":99999}' "http://localhost:18080/customer/")
echo "return id=$Id1 ,-1 means insert failed"


echo -e "\033[31m #insert into customer addressId=1\033[0m"
Id2=$(curl -H "Content-Type: application/json" -s -X POST -d '{"storeId":1,"firstName":"aaa","lastName":"aaa","email":"insert@email.com","addressId":1}' "http://localhost:18080/customer/")
echo "return id=$Id2 ,not -1 means insert succeed"


echo -e "\033[31m #update customer $Id2\033[0m"
data=$(curl -H "Content-Type: application/json" -s -X PUT -d '{"storeId":1,"firstName":"ccc","lastName":"ccc","email":"insert@email.com","addressId":1}' "http://localhost:18080/customer/$Id2")
echo "data = $data"


echo -e "\033[31m #delete customer $Id2\033[0m"
curl -s -X DELETE "http://localhost:18080/customer/$Id2"
echo "delete over"