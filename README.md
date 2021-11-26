# SpringBootDocker
Spring Boot with Docker first example

#How to Run Application

$ git clone https://github.com/vgund9/SpringBootDocker.git
$ cd SpringBootDocker
$ mvn clean package
$ java -jar target/app-0.0.1-SNAPSHOT.jar

access http://localhost:8080

#Dockerized

Build a docker image using below commond

#### docker build -t springbootdocker:1.0 .

Tag Name | Shortcut | Description  
--- | --- | --- 
--tag | -t | Name and optionally a tag in the 'name:tag' format 
--file | -f | dockerfile path  

Run docker image using below commond

#### docker run -d -p 8080:8080 -t springbootdocker:1.0

Tag Name | Shortcut | Description  
--- | --- | --- 
--detach  | -d | Run container in background and print container ID
--publish | -p | Publish a container's port(s) to the host


#### for more tags please visit below urls
https://docs.docker.com/engine/reference/commandline/build/
https://docs.docker.com/engine/reference/commandline/run/
 

####access http://localhost:8080/123

##Spring doc openapi With Swagger UI

http://localhost:8080/swagger-ui/index.html


#References 
https://docs.docker.com/reference/


