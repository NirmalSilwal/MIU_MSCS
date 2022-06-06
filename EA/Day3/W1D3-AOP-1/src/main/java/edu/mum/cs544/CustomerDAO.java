package edu.mum.cs544;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAO implements ICustomerDAO{
	
	public void save(Customer customer) {
		try {
			Thread.sleep(350);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("CustomerDAO: saving customer "+customer.getName());
	}

}
