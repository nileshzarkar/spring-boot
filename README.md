**Spring Boot Tutorial** <br>
Reference: https://www.youtube.com/playlist?list=PLGRDMO4rOGcNSBOJOlrgQqGpIgo6_VZgR <br>

**video2 : Spring Data REST model Tutorial** <br>
<dependency> <br>
			"<groupId/>org.springframework.boot</groupId/>" <br>
			"<artifactId/>spring-boot-starter-data-rest</artifactId/>" <br>
</dependency> <br>
The spring data rest model dependecy will scan all the models and creates rest endponits automatically for our models or entities in our application. <br>
We dont have to write a rest API code for our entity/model in our project. <br> 
What is the problem spring data rest solves ? <br>
In typical MVC project we create controller, service and dao layer. <br>
Say we want to create rest api for employee then we have to create <br>
EmployeeController (define the rest endpoints) <br>
EmployeeService (The interface) <br>
EmployeeServiceImpl (The implementation) <br>
So we have to create 3 files <br>
Suppose we have many entities department, project, company we have to repeat this for each of these entities <br>

We are repeating the code only entity name is changing, so the solution to this is create the rest endpoints for each of these entities automatically.<br>
![image](https://user-images.githubusercontent.com/6234135/170905970-7740c7a1-4a86-4537-84f1-ca82ff4743b6.png) <br>

![image](https://user-images.githubusercontent.com/6234135/170906118-f5af8f91-862d-49fd-9c0d-c3bee423e0ad.png) <br>
Spring data rest module expose all these endpoints free <br>
![image](https://user-images.githubusercontent.com/6234135/170906223-8be30481-0d3b-4db3-a2e8-22ea7da369df.png) <br>
1. Spring data rest moddule scans the JPARepository. <br>
2. JPARepository exposes the CRUD methods to perform database operations on the respective entity. <br>
 
![image](https://user-images.githubusercontent.com/6234135/170906652-12660c79-03d6-48de-a5f0-e1507a1ec498.png) <br>
![image](https://user-images.githubusercontent.com/6234135/170906833-fd89c37b-d598-4673-9356-bb30ca21f2fe.png) <br>
The response of all the REST APIs that are generated by spring data rest module are in HATEOS format. <br>
Basically the response contains a meta-data links that navigate to to other data or rest endpoints or rest APIs. <br> 
![image](https://user-images.githubusercontent.com/6234135/170907005-036f4ab7-4059-4412-90f1-3e2ff12a56b8.png) <br>

![image](https://user-images.githubusercontent.com/6234135/170907151-8e6b5d1d-2d6e-4ca0-a942-f480bb83b5c7.png) <br>
![image](https://user-images.githubusercontent.com/6234135/170907245-f83ad3f3-42a1-4982-bb90-53f98d087210.png) <br>

http://localhost:8080/users <br>

HATEOS format <br>
![image](https://user-images.githubusercontent.com/6234135/170910373-23fccf44-132d-4a37-9b38-8d4e8291206d.png) <br>

data for pagination as well <br> 
![image](https://user-images.githubusercontent.com/6234135/170910552-52ed87bd-f379-4132-8de5-fb8ff2a8fc05.png) <br>

POST REQUEST <br>
![image](https://user-images.githubusercontent.com/6234135/170910907-2c9f5640-f4b3-479d-b7c4-2736ab66867a.png) <br>
![image](https://user-images.githubusercontent.com/6234135/170910951-a71a1434-bad1-43dc-ba59-bcb0a53cc720.png) <br>

PUT REQUEST <br>
![image](https://user-images.githubusercontent.com/6234135/170911108-e69d3cde-ccf6-4bf5-9bd7-8978d762eb36.png) <br>
![image](https://user-images.githubusercontent.com/6234135/170911128-50e548a1-e92e-4a1c-b73c-7c2739c5bd67.png) <br>

DELETE REQUEST <br>
![image](https://user-images.githubusercontent.com/6234135/170911214-e95dba30-bcd8-4eab-bd9a-7da6c3b7a91f.png) <br>
![image](https://user-images.githubusercontent.com/6234135/170911241-053e9bf4-31eb-41c7-914b-3b91f54080c2.png) <br>

Configuring Base Path for REST APIs <br>
![image](https://user-images.githubusercontent.com/6234135/170912233-9328914c-b1ea-4b22-a7fb-50ee351bbf38.png) <br>
![image](https://user-images.githubusercontent.com/6234135/170912217-96b8ec7a-8c83-4b88-82fe-22639f531d9b.png) <br>

Change Path name using @RepositoryRestResource annotation <br>
http://localhost:8080/api/v1/**users**/1 <br>
Sometimes we do not want **users** rather client wants something else here say for exmaple **members**<br>
http://localhost:8080/api/v1/**members**/1 <br>
![image](https://user-images.githubusercontent.com/6234135/170912613-bde0e23a-8044-482f-99a1-2af8e433010b.png) <br>
![image](https://user-images.githubusercontent.com/6234135/170912680-c95de417-ff1f-42c9-b9bd-146c89f34260.png) <br>

Paginiation and Sorting Support<br>
Paginiation <br>
![image](https://user-images.githubusercontent.com/6234135/170913092-adc20729-df79-4e11-b3e6-ac9e08e434f7.png) <br>
![image](https://user-images.githubusercontent.com/6234135/170913340-0232973a-ca75-4aee-a2b7-17f9ad070d0a.png) <br>
![image](https://user-images.githubusercontent.com/6234135/170913368-4a6ba5d8-f0fe-4e6b-bf8b-750d66106db3.png) <br>
![image](https://user-images.githubusercontent.com/6234135/170913442-07b74e80-9e9a-4efd-9613-0194109f6330.png) <br>
![image](https://user-images.githubusercontent.com/6234135/170913569-046a05ed-12c9-411f-b5e4-5a62e10cc0be.png) <br>
Sorting <br>
![image](https://user-images.githubusercontent.com/6234135/170913700-4a87acd2-5763-4141-8be8-4e8e8bc01284.png) <br>
![image](https://user-images.githubusercontent.com/6234135/170913933-7fb32f53-6e92-4496-853c-3b27ff72ab08.png) <br>

REST API for Query Methods <br>
![image](https://user-images.githubusercontent.com/6234135/170915381-f89805f9-03b0-46d1-99dc-c69e4cf41e65.png) <br>
![image](https://user-images.githubusercontent.com/6234135/170915310-17963777-d06f-4950-a018-224b29a66b09.png) <br>



**spring-boot-thymeleaf-1 : Spring Boot Thymeleaf Hello World Example Tutorial** <br>

![image](https://user-images.githubusercontent.com/6234135/170919512-31d64324-115a-442b-8f1f-25b1b7e6c320.png) <br>
![image](https://user-images.githubusercontent.com/6234135/170919537-f43df9a5-4e26-4eb6-a0f4-3d1a736540db.png) <br>
![image](https://user-images.githubusercontent.com/6234135/170920099-feb22fc7-6d4a-4a80-8352-d29ef7fcbe3f.png) <br>


**spring-boot-thymeleaf-part-1 : Spring Boot Thymeleaf CRUD Database Real-Time Project - PART 1** <br>
![image](https://user-images.githubusercontent.com/6234135/170921048-d979a9ee-6164-40fc-93fd-0e6c26d569ae.png) <br>
![image](https://user-images.githubusercontent.com/6234135/170921091-7cf716fb-d355-4add-aeca-e5be5a950a17.png) <br>
![image](https://user-images.githubusercontent.com/6234135/170921136-edf40442-856d-4a34-9252-eea139d44180.png) <br>
![image](https://user-images.githubusercontent.com/6234135/170921187-cd6d911a-b814-4b13-a0f4-159a9b607c82.png) <br>
![image](https://user-images.githubusercontent.com/6234135/170921261-500af395-20e2-46c6-8987-fc886c995513.png) <br>
![image](https://user-images.githubusercontent.com/6234135/170922260-1c961ed5-b995-49a6-b8f9-b2810f298885.png) <br>


**spring-boot-thymeleaf-part-2 : Spring Boot Thymeleaf CRUD Database Real-Time Project - PART 2** <br>
When spring boot find the thymeleaf starter dependency in class path then <br> 
![image](https://user-images.githubusercontent.com/6234135/170923487-199af66e-898e-420e-8132-c24c4908dc99.png) <br>
![image](https://user-images.githubusercontent.com/6234135/170925197-b412623b-7753-4ef4-9f67-acaea6bdb7d6.png) <br>
![image](https://user-images.githubusercontent.com/6234135/170925293-c7eefe9c-9e9e-420e-a2b0-6be97b413cb9.png) <br>
Add data manually to the mySQL database <br>
![image](https://user-images.githubusercontent.com/6234135/170925579-00133fe7-2f76-442d-b0b1-8e7253b2f4ba.png) <br>
![image](https://user-images.githubusercontent.com/6234135/170927166-f9410494-aa38-4527-972a-acac4ea3586d.png) <br>








































