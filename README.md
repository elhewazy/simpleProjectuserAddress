# simpleProjectuserAddress i will improve this app for more advanced feature
this a simple project you can use Json format to add user with address
@quary param you can use ahmed to search by name or you can add as you like and search again by the name you add it
http://localhost:8080/useres/search?name=ahmed
http://localhost:8080/addUser
{
    "name": "ahmed",
    "email": "ahmed@yahoo.com",
    "age": 14,
    "address": {
        "street": null,
        "city": null,
        "state": null,
        "country": null
    }
}
#and to get user should to add the id number 
http://localhost:8080/getUser/id 

#delet
http://localhost:8080/deleteUser/id

#update

http://localhost:8080/updateUser/
