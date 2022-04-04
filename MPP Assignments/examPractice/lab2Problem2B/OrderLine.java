package examPractice.lab2Problem2B;

public class OrderLine {

	private Order order;
	private double price;

	OrderLine(double price, Order order) {
		this.price = price;
		this.order = order;
	}

	public double getPrice() {
		return price;
	}

	public Order getOrder() {
		return order;
	}

	@Override
	public String toString() {
		return "price: " + price ;
	}
}
