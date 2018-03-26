# Authentication-using-Netflix
This Project will get you through the basics of Netflix OSS framework and also implement the same in basic user Authentication.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.
Sequence of modules to run
-> eureka-naming-server (port:8761)
-> login (8090)
-> register (8091)
-> netflix-zule-api-server (8765)

localhost:8765/register/register to register for new user
localhost:8765/login/register-authenticate to authencticate for new user
### Prerequisites

What things you need to install the software and how to install them :

You need a editor or IDE anything you prefer. I used Spring Tool Suite for this project.
https://spring.io/tools/sts/all

After installing above tools you need a server to run your JavaEE project. For that i used Apache Tomcat 8 Server (http://tomcat.apache.org/) and also you need some jar files to render json requests (http://www.java2s.com/Code/Jar/j/Downloadjsonsimple11jar.htm).

### Installing

A step by step series of examples that tell you have to get a development env running.
Install STS and Apache Tomcat Server on your machine. Add path to that server in your STS Build path. After that you need to download all the jar files mentioned above, add them in your STS environment and you are good to go.

## Built With

* [JavaEE]
* [JavaScript]
* [JSP-Servlet]
* [Spring Tool Suite](https://spring.io/tools/sts/all)
