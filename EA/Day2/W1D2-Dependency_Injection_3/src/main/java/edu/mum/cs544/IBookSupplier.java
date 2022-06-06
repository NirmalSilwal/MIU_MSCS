package edu.mum.cs544;

import org.springframework.stereotype.Component;

@Component
public interface IBookSupplier {
	public double computePrice(String isbn);
	public void order(Book book);
}
