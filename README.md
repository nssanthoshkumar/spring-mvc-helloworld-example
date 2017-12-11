# Spring MVC Hello world program with Redis

Steps to run locally
---
1. Start redis instance in local machine with default port.
2. cd spring-mvc-helloworld-example
3. mvc clean install
4. mvc tomcat7:run
5. Access the application with url http://localhost:8080

Steps to run in Pivotal Cloud Foundry
---
1. cd spring-mvc-helloworld-example
2. Login to PCF instance using cf command
3. Create redis service instance with name 'spring-mvc-helloworld-example-redis'
4. push the app using command 'cf push'
5. Wait for the application to start successfully in PCF
6. Access the application using route URL.
