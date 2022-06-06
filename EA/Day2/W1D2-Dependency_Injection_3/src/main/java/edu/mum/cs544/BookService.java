package edu.mum.cs544;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

public class BookService implements IBookService {
	@Autowired
	public List<IBookSupplier> suppliers; //= new ArrayList<IBookSupplier>();
//	private final IBookSupplier bookSuppliers;
	
	
	
	
	
	public BookService() {
//		this.bookSuppliers = bookSuppliers;
		
//		IBookSupplier amazon = new Amazon();
//		IBookSupplier barnesandnoble = new BarnesAndNoble();
//		IBookSupplier ebooks = new EBooks();

//		bookSuppliers.add(amazon);
//		bookSuppliers.add(barnesandnoble);
//		bookSuppliers.add(ebooks);
	}
	
	

	public void buy(Book book) {
		double lowestPrice = 0;
		IBookSupplier cheapestSupplier = null;
		// find the cheapest supplier
		for (IBookSupplier supplier : suppliers) {
			double price = supplier.computePrice(book.getIsbn());
			if (cheapestSupplier == null) {
				cheapestSupplier = supplier;
				lowestPrice = price;
			} else {
				if (price < lowestPrice) {
					cheapestSupplier = supplier;
					lowestPrice = price;
				}
			}
		}
		// buy with the cheapest supplier
		if (cheapestSupplier != null) {
			cheapestSupplier.order(book);
		}

	}
}