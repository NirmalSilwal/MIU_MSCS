package lab9.assignments.lesson9.labs.prob2;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
	List<Order> orders;

	public static void main(String[] args) {
		Main m = new Main();
		m.loadOrderData();
		m.displayAllOrders();
		m.showAllOrderItems();

	}

	// Uses flatMap to write to console a list of all order items
	private void showAllOrderItems() {
		System.out.println("\n==============\nAll order items:");
		// implement

		orders.stream().flatMap(o -> o.getOrderItems().stream()).forEach(System.out::println);

	}

	private void displayAllOrders() {
		System.out.println(orders);
		;
	}

	private void loadOrderData() {
		orders = new ArrayList<>();
		Order o = new Order(LocalDate.of(2011, 10, 5), "10-210", "1001", 2, 11);
		o.addOrderItem("1002", 1, 23);
		o.addOrderItem("1003", 1, 45);
		orders.add(o);

		o = new Order(LocalDate.of(2001, 11, 15), "11-220", "1015", 2, 33);
		o.addOrderItem("1016", 3, 15);
		o.addOrderItem("1017", 1, 22);
		o.addOrderItem("1018", 2, 19);
		o.addOrderItem("1019", 5, 9);
		orders.add(o);

		o = new Order(LocalDate.of(2011, 10, 5), "10-210", "1022", 1, 80);
		o.addOrderItem("1023", 1, 28);
		o.addOrderItem("1024", 1, 41);
		orders.add(o);
	}

}
