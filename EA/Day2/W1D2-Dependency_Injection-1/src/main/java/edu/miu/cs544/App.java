package edu.miu.cs544;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
//        System.out.println("FIXME: Empty Project");
//		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		// using xml config
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		Greeting greeting = context.getBean("greeting", Greeting.class);
		
		greeting.sayHello();
	}
}
