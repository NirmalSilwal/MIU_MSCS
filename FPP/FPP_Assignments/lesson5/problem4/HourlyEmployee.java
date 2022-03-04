package lesson5.problem4;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class HourlyEmployee extends Employee {

	double wage;
	double hours;

	HourlyEmployee(String firstName, String lastName, String ssn, double wage, double hours) {
		super(firstName, lastName, ssn);
		this.wage = wage;
		this.hours = hours;
	}

	@Override
	public double getPayment() {
		return this.wage * this.hours;
	}

	public double getWage() {
		return this.wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return this.hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "first name: " + this.getFirstName() + ", last name: " + this.getLastName() + ", SSN: "
				+ this.getSocialSecurityNumber() + ", Wage: " + this.getWage() + ", Hours: " + this.getHours();
	}
}
