package lab2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Order myorder1 = new Order(1, 1000);
		myorder1.addOrderLine(100);

		Order myorder2 = new Order(2, 2000);
		myorder2.addOrderLine(200);

		Order myorder3 = new Order(3, 3000);
		myorder3.addOrderLine(300);

		List<Order> myAllOrders = new ArrayList<>();
		
		myAllOrders.add(myorder1);
		myAllOrders.add(myorder2);
		myAllOrders.add(myorder3);
		
		System.out.println(myAllOrders);
	}

}
