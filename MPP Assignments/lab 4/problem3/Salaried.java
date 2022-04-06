package lab4.problem3;

import java.util.Date;

public class Salaried extends Employee {

	private double salary;

	@Override
	public double calcGrossPay(int month, int yr) {

		return salary;
	}

}