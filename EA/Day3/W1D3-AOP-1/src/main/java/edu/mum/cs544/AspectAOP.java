package edu.mum.cs544;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.util.Date;

@Aspect
@Component
public class AspectAOP {

	@Pointcut("execution (public void edu.mum.cs544.EmailSender.sendEmail(*,*))")
	public void logEmailSend() {
	}

	@Pointcut("execution(public void edu.mum.cs544.CustomerDAO.save(*))")
	public void logDAOsave() {
	}

	@After("logEmailSend()")
	public void logAfterEmailSend(JoinPoint joinPoint) {
		System.out.println(new Date() + " method= " + joinPoint.getSignature().getName());
		Object objects[] = joinPoint.getArgs();
		System.out.println("address = " + objects[0] + ", message= " + objects[1]);
		EmailSender sender = (EmailSender) joinPoint.getTarget();
		System.out.println("outgoing mail server = " + sender.getOutgoingMailServer());
	}

	@Around("logDAOsave()")
	public void logTimeForEmailSend(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		StopWatch sw = new StopWatch();
		sw.start(proceedingJoinPoint.getSignature().getName());
		Object retVal = proceedingJoinPoint.proceed();
		sw.stop();
		long totaltime = sw.getLastTaskTimeMillis();
		System.out.println("Time to execute save = " + totaltime + " ms");
	}

}
