# SuperMarket

SuperMarket is a project that where you can monitor products and order. You can do these:

  - Search customer and customer's orders
  - Create order
  - Add products in any order into order
  - See how much you saved
  - Add new types of discounts

### Tech

SuperMarket uses techs to work properly:

* [Java 1.8] 
* [MongoDB] 
* [Maven] 
* [Spring Boot] 
* [Spring Data]
* [Apache Commons]
* [Logback] 
* [Sonar] 


### Installation

You need installed Maven on your local:

And you can use maven commands basically.

The default mongodb connection properties are for the localhost. If you want to override them, you can give parameters as JVM arguments such as

-Dspring.data.mongodb.host=YOUR_MONGODB_HOST
-Dspring.data.mongodb.port=YOUR_MONGODB_PORT
-Dspring.data.mongodb.database=YOUR_MONGODB_DATABASE

The default settings can be found in src/main/resources/application.properties as

spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=SuperMarket

### Usage

Project not completed yet

