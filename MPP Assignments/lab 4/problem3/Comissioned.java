package lab4.problem3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Comissioned extends Employee {

	private double comission;
	private double baseSalary;
	private List<Order> orders;

	public Comissioned(double comission, double baseSalary) {
		this.comission = comission;
		this.baseSalary = baseSalary;
		this.orders = new ArrayList<>();
	}

	@Override
	public double calcGrossPay(int month, int yr) {

		if (orders == null)
			return 0.0;
		if (orders.size() < 1)
			return 0.0;

		double grossPay = 0.0;

		for (Order o : orders) {
			Date orderDate = o.getOrderDate();
			int orderYear = orderDate.getYear();
			int orderMonth = orderDate.getMonth();
			if (orderYear == yr && orderMonth == month) {
				grossPay = grossPay + o.getOrderAmount();
			}
		}

		return grossPay + comission + baseSalary;
	}

}