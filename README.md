## Todo List
1. It is a project to become better familiar with the Spring MVC.
2. This project implements a todo-list website.
3. Especially include the following dependencies:
    1. spring-webmvc
    2. jakarta.servlet-api
4. Especially include the following plugins:
    1. maven-war-plugin, is used to package project as a war file.  
    2. cargo-maven3-plugin, supports a wide range of containers, including `Tomcat`, Jetty, JBoss, and WebSphere, among others.
## Details
1. During the initialization of the Servlet container, Tomcat will call the onStartup() method of any class that has implemented the WebApplicationInitializer interface.