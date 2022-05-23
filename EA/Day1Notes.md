DAO - Data Access Object
> single big applications is called **Monolith**
> - Monolith applicaition has _maintainaibility issues_.

#### Different ways to integrate applications:
- Remote Procedure Invocation (Synchronous)
- Messaging (Asynchronous)

> Enterprise Service Bus (ESB) - used for integration of various services 

#### ESB coordinates activities between the services. It can contain logic and combine services.

>  - think of bus in terms of hardware bus which is collection of wires that caries lots of information in given price, you have to pay for the service of the bus also, not just use it
>  - consumers work with ESB and then ESB coordinates with various services 
>  - ESB contains logic for **routing, combining, tranformation, business rules**
>  - all these can be useful but _can be the real problem_ since business logic spread between various services 
>  - ESB is single, monolithic, center of application which means **single point of failue** also

Now the idea of micro services came as the idea to solve the issues with ESBs. Micro Services emphasis that logic should be on services not on connection.
- you still need to combine various micro services 

####  Seperation of concern is the key to maintainaibility and good architecture.
