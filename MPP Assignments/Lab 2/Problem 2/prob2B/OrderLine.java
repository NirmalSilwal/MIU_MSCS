package lab2.prob2B;

public class OrderLine {

	private double price;
	private Order order;
	
	public OrderLine(double price, Order order) {
		this.price = price;
		this.order = order;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "price: " + this.price +" ";
	}

}
