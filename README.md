# Ms-sb 
* ## Java 17
* ## Spring boot 3.1.2
## On this project I have use database to stock up my data

## Some step to get the project : 
* ### download the project 
* ### mvn clean install -d
* ### go to the root folder and execute the next command : docker compose up
* ### When the docker started you can use databases and run the application

## OpenAPI
* ### We have integrate openAPI to test the controller and show the entitys ans dto
* ### when we have run the project you can go on this URL : http://localhost:8080/swagger-ui/index.html# and you can use the API.

## Databases 
* ### When the docker he started you can go on this URL to check the Databases : http://localhost:5050/browser/
* ### When you are on the URL log in with this ID : email : ms-sb@root.fr / password : password
* ### after did right click on -> server -> Register Server and complete with the next information 
* #### Name : Databases
* #### Go to window connection
* #### Host name : db
* #### Usernam : omega
* #### Password : root
* #### Save
* ### You have now acces to the db "customers" 
* ### On the ressources folder they have file : populate.sql is initialised when we run the application. We can work with this data 