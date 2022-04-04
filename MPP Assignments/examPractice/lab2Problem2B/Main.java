package examPractice.lab2Problem2B;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Order myorder = new Order(1, 100);
		myorder.addNewOrder(200);
		myorder.addNewOrder(300);
		
		Order myorder2 = new Order(2, 10);
		myorder2.addNewOrder(20);
		myorder2.addNewOrder(30);
		
		List<Order> allorders = Arrays.asList(myorder, myorder2);
		
		System.out.println(allorders);
	}
}

