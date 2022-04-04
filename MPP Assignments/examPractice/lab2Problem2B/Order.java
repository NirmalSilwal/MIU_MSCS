package examPractice.lab2Problem2B;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private int orderNum;
	List<OrderLine> orderline;

	public Order(int orderNum, double price) {
		this.orderNum = orderNum;
		this.orderline = new ArrayList<OrderLine>();
		addNewOrder(price);
	}

	public void addNewOrder(double price) {
		orderline.add(new OrderLine(price, this));
	}

	public int getOrderNum() {
		return this.orderNum;
	}

	@Override
	public String toString() {
		String result = "";

		for (OrderLine currentorder : orderline) {
			result += currentorder.toString() + "\n";
		}

		return result;
	}
}
