package lesson5.problem4;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class BasePlusCommisionEmployee extends CommissionEmployee {

	double baseSalary;

	BasePlusCommisionEmployee(String firstName, String lastName, String ssn, double grossSales, double crate,
			double baseSalary) {

		super(firstName, lastName, ssn, grossSales, crate);
		this.baseSalary = baseSalary;
	}

	public double getPayment() {
		return super.getPayment() + this.baseSalary;
	}

	public double getBaseSalary() {
		return this.baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return "first name: " + this.getFirstName() + ", last name: " + this.getLastName() + ", SSN: "
				+ this.getSocialSecurityNumber() + ", Gross sales: " + this.getGrossSales() + ", commision rate: "
				+ this.getCommisionRate() + ", base salary: " + this.getBaseSalary();
	}

}
