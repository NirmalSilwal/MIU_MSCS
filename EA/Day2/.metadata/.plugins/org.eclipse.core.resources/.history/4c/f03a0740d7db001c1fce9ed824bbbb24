package edu.mum.cs544;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.mum.cs544")
public class Config {
	@Bean
	public List<IBookSupplier> bookSuppliers() {
		return Arrays.asList(new EBooks(), new Amazon(), new BarnesAndNoble());
	}
	
}
