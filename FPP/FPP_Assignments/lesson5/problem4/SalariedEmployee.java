package lesson5.problem4;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class SalariedEmployee extends Employee {

	double weeklySalary;

	SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
		super(firstName, lastName, ssn);
		this.weeklySalary = weeklySalary;
	}

	@Override
	public double getPayment() {
		return this.weeklySalary;
	}

	public double getWeeklySalary() {
		return this.weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	public String toString() {
		return "first name: " + this.getFirstName() + ", last name: " + this.getLastName() + ", SSN: "
				+ this.getSocialSecurityNumber() + ", weekly salary: " + this.getWeeklySalary();
	}

}
