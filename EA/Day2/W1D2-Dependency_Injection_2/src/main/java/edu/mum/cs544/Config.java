package edu.mum.cs544;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.miu.cs544")
public class Config {
	@Bean
	public IProductService productService() {
		return new ProductService();
	}
	
	@Bean
	public IInventoryService inventoryService1() {
		return new InventoryService();
	}
}
