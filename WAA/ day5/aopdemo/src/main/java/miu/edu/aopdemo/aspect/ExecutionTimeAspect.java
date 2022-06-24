package miu.edu.aopdemo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTimeAspect {

    @Pointcut("@annotation(miu.edu.aopdemo.aspect.annotation.ExecutionTime)")
    public void executionTimeAnnotation(){

    }

    @Around("executionTimeAnnotation()")
    public Object calculateExecutionTime(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.nanoTime();
        Object result = pjp.proceed();
        long finish = System.nanoTime();

        System.out.println(pjp.getSignature().getName() + " takes ns: " + (finish - start));

        return result;
    }
 }
