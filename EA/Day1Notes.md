DAO - Data Access Object
> single big applications is called **Monolith**
> - Monolith applicaition has _maintainaibility issues_.

#### Different ways to integrate applications:
- Remote Procedure Invocation (Synchronous i.e requests waits for the response)
     - currently primarily used with Web Services like REST, SOAP
- Messaging (Asynchronous)
     - sending without requiring the direct response
     - standards like JMS, MSMQ, AMQP
     - either Publish/Subscribe or Point to Point sending

> Enterprise Service Bus (ESB) - used for integration of various services 

#### ESB coordinates activities between the services. It can contain logic and combine services.

>  - think of bus in terms of hardware bus which is collection of wires that caries lots of information in given price, you have to pay for the service of the bus also, not just use it
>  - consumers work with ESB and then ESB coordinates with various services 
>  - ESB contains logic for **routing, combining, tranformation, business rules**
>  - all these can be useful but _can be the real problem_ since business logic spread between various services 
>  - ESB is single, monolithic, center of application which means **single point of failue** also

Now the idea of micro services came as the idea to solve the issues with ESBs. Micro Services emphasis that logic should be on services not on connection.
- you still need to combine various micro services 

> Seperation of concern is the key to maintainaibility and good architecture.

#### Principles and Patterns

1. **Domain Driven Design**- all business logic is captured in the **domain model** that reflects the real world and the business logic objects are independent of the technology related code.
   - it's advantage is that the business logic is independent of the technology and is easy to understand also (easy to write, test, modify)
 
**Containers** - piece of software that manages your object. Eg- web container (Servlet), EJB / Spring Bean Container, JPA EntityManager
- The main principle that containers use is the **Inversion of Control (IoC)**/ Hollywood Principle (_don't call us, we'll call you_)
- let our code not call libraries, rather let the framework call our code
- The important part of IoC is that **container creates and manages** your objects.

#### Dependency Injection
- this is what most containers do and it is related with **loose coupling**.
- the containers **creates and connects** objects together, injects one into the other **@Inject**

#### Aspect Oriented Programming (AOP)
- some functionalities are used in many services like _transcation, security, logging..._, so you don't wanna copy paste whole bunch of code right! hence, AOP will help us here :)
- with AOP you can **write** code for a cross-cutting concern **once** (in an **advice method**)
- then **specify all the points** that the advice should run. This is called Aspect.
- **Containers implements AOP.** You can make **proxy object** and inject to make it look like real thing. The proxy calls the Advice method.
  - also called _interceptor pattern_
 
 #### Object Relational Mapping (ORM)
 - relational databases are often the best use for business applications
 - since there are difference between the OO and relational models, we use **Object Relational Mapping (ORM)** to bridge the gap
 - so majorly we need to do mapping in areas like _identity mapping, associations mapping and inheritance mapping_****

> Java Persistence Query Language (JPQL) used for data retrieval like SQL but OO way

### Two most common data related patterns
  - **Repositories (aka DAO)**
  - **Data Transfer Objects (DTO)**

### Maven
- Maven is the build system
- Dependency Manager (downlaods JARs)
- Maven has a POM (project object model) file - **pom.xml**. POM tells maven what your project is and what it needs
- Maven has **archetypes** (starter projects for certain things, but they're often outdated)
- it has standarized directory structure
- **Maven builds, tests and packages your code**
 
3 main areas of pom files are
   - 1. Project description
   - 2. **Dependencies**
   - 3. Plugins (special compiling/packaging) 



