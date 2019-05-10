# Productive Java Development with Spring and Spring Boot



#### Spring framework structure in this course:

* Spring Core
* Spring Web
* Spring Data
* Spring Actuator
* Spring REST
* Spring Boot



#### Before Spring:

* Enterprise Java Application
    * Components
        * Jave Archive - JAR
        * Web Archive - WAR
        * Enterprise Archive - EAR
    * Containers
        * Enterprise Java Beans - EJBs
    * Services
        * Security, transactional, resource pooling, persistence
    * Meta-data
        * XML
Spring to the rescue
* Goal: lightweight container for all kinds of services to serve POJOs (Plain Old Java Objects).
* Dependency Injection - DI
* Inversion of Control - IoC
* Convention over Cofiguration - CoC



#### What is Bean:

* POJO
    * No-arg constructor
    * Serialisation
    * Provide getters and setters
* Spring Bean
    * Annotated appropriately
    * Constructed by IoC container
    * Contained in IoC container within the context



#### What is IoC:

* Apply “bean” requirements
* Implement your business logic or just POJO
* Run your application
* Spring initialise IoC
* Beans are initialised as “singleton” (by default)



#### What is Spring Boot:

* Steps to run a “boot”less application
    * Drown in the configuration and try to implement the app
    * Fire up an application server
    * Prepare a deployment descriptor for all of our components
    * Deploy our app and have it running
* Tremendously easy to create stand-alone, production-grade applications
* Create and run your application with just an annotation
* Build any kind of application as a “single” runnable JAR
* Very little configuration for most applications
* Runs a custom embedded version of Tomcat to contain our application



#### IDE options:

* Eclipse with Spring Plugin
* Spring Tool Suite - STS
* Netbeans with Spring Module
* Intellij IDEA



#### [Spring Initializr](https://start.spring.io/)



#### Maven Highlight:

* A tool manage your software builds
* Manages all dependencies you need with its “pom.xml” file
* Version your software
* Add JAR files (dependencies) to XML within appropriate tags
* Commands:
    * clean
    * install



#### Spring Boot Application Lifecycle:

* **Part 1**
    
    1. Initialise
    2. deduceWebEnvironment
        * Web environment in case javax.servlet.Servlet or ConfigurableWebApplicaitonContext found in classpath.
    3. ApplicationContextInitialiser - Input: Scan for all the META-INF/spring factories on the classpath.
        * Callback interface for initialising Spring context prior to being refreshed.
    4. ApplicationListener              - Input: Scan for all the META-INF/spring factories on the classpath.
        * Interface to be implemented by application event listeners, based on the Observer design pattern.
    5. deduceMainApplicationClass
        * Throws a RuntimeException and scans for the Class in the StackTrace having the main method
    6. Run
    7. Started()
    8. SpringApplicationRunListener * n
* **Part 2**
    
    1. prepareEnvironment >> Environment 
        * >> Profiles
        * >> Properties
    2. envPrepared >> SpringApplicationRunListener * n
      
        * Banner
    3. createContext
    4. prepareContext
    5. contextPrepared() >> SpringApplicationRunListener * n
* **Part 3**
    
    1. On Loaded >> contextPrepared() >> SpringApplicationRunListener * n
    2. refreshContext
    3. finished >> SpringApplicationRunListener * n



#### Spring Application Properties:

* application.properties
    * e.g. spring.application.name=...
* application.yml
    * e.g. 
dev
    url: ...
    name: ...
* Ways to configure applications
    * Inject properties directly to variables
    * Command line arguments
    * JVM arguments
    * Environment variables
    * VCAP services



#### Spring MVC with Spring Boot:

* What is MVC?
    * Design pattern in software engineering principles
    * MVC stands for Model, View and Controller



#### Templating and Template Engines:

* Template Engines:
    * Apache Velocity
    * Apache FreeMaker
    * Pebble
    * Thymeleaf



#### Spring Data

* An abstraction on top of Java Persistence API (A wrapper around JPA)
* Powerful repository allow custom object-mapping abstractions
* Dynamic query creation form repository method names
* Implement domain base classes with their basic properties
* Custom repository management
* Cross-store persistence



#### H2 In-Memory Database

* Very fast
* Open source
* JDBC API
* Embedded and Server modes available
* In-memory database
* Browser-based console application
* Very small footprint  ~ 1.5 MB jar file size



#### REST API:

* Abbtrviation of REpresentational State Transfer
* An architectural style for the web
* A set of design criterias
* Not tied to Web; you don’t even need HTTP to use REST
* Nearly all the applications you see on the web today are REST-backed architectures
* Defined depending on the resource they represent
* Resource can be a document, a row of a database or even the output of an algorithm
* REST APIs are defined around URIs
* If there’s no URI than we simply cannot talk about a resource
* Best-practice to have sub URIs as query parameters
* YTIs must be descriptive and easy-to-read
* Key abstraction of information is a resource, named by a URI
* Every HTTP request happens within a complete isolation form another
* There’s no ordering of client requests
* To track states, relevant URIs must be defined
* All interactions are context-free
* Resources are not DATA
* The web server must respond to a request by sending a series of bytes
    * Formats: XML/JSON, HTML, PDF, PPTX, DOCS...
    * Languages: English, Turkish, Spanish, Portuguese...
* Client sets specific HTTP request headers to signal what representations it accepts
    * Accept: Acceptable file formats
    * Accept-Language: Preferred Language



#### HTTP Requests:

* GET provides us the representation of the resource
* PUT generally used to either update or modify resources
* POST is to create a new resource from scratch
* DELETE is to simple delete an existing resource
* HEAD is short for header and is used to fetch meta-data or read data for the resource
* OPTIONS and the resource gives you vail the possible operations
 HTTP Response Codes
* Ranging from 200s to 500s:
    * 2xx Success (e.g. 200 OK, 201 Created)
    * 3xx Redirection (e.g. 303 See Other)
    * 4xx Client error (e.g. 404 Not Found)
    * 5xx Server error (e.g. 500 Internal Server Error)



#### HTTP Clients:

* Browsers and Non-Browsers
    * Browsers (Chrome, Firefox, Safari, Edge)
    * Apache HTTP Client
    * REST Template
    * Feign Client
    * Eureka Sever/Client



#### MVC CRUD Application:

Represented in this repository.









---

##### Reference: 

> [Productive Java Development with Spring and Spring Boot](https://learning.oreilly.com/learning-paths/learning-path-productive/9781838822651/)

##### Resources:

> [Spring Boot](https://spring.io/projects/spring-boot)
> [RabbitMQ](https://www.rabbitmq.com/) (AMQP)