package miu.edu.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

    @Pointcut("@annotation(miu.edu.aopdemo.aspect.annotation.LogMe)")
    public void a() {
    }

    @Before("a()")
    public void log(JoinPoint joinPoint) {
        System.out.println("inside log in logger aspect");
        System.out.println("method name: " + joinPoint.getSignature().getName());
    }
}
