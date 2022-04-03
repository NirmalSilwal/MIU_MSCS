package lab2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private int orderNum;
	private List<OrderLine> orderline;

	Order(int orderNum, double price) {
		this.orderNum = orderNum;
		this.orderline = new ArrayList<>();
		addOrderLine(price);
	}

	public int getOrderNum() {
		return this.orderNum;
	}

	public void addOrderLine(double price) {
		orderline.add(new OrderLine(price, this));
	}

	@Override
	public String toString() {
		String ans = "Orders: ";

		for (OrderLine myorder : orderline) {
			ans += myorder.toString();
		}

		return ans + "\n";
	}
}
