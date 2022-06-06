package edu.miu.cs544;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Greeting {

	@Value("Hello World")
	private String greeting;

	public void sayHello() {
		System.out.println(greeting);
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
}
