# AOP and Spring Apps

**Aspect Oriented Programming(AOP)** is a way to provide seperation of concerns, creating modularity.

**Cross Cutting Concerns** are usually scattered or tangled throughout your code.
- Logging is scattered - single thing, copy and pasted everywhere
- Transactions are tangled - a part before, a part afterwards after you use db everytime

AOP with Spring uses the **interceptor pattern.**
> Spring creates proxies using either **JDK or CGLIB**, (cg - code generation)
> if there are no interfaces Spring uses CGLIB
> spring prefers JDK proxies

The implementation of cross cutting concern is called **Advice**. Adivce is implemented as a method in the class.
> join point is the method in class where the advice will be applied
> a pointcut is the collection of points which is described in _pointcut expression language_
> Aspect is the combination of advice and pointcut - _what should execute where_
> weaving is seen at execution time
> 
