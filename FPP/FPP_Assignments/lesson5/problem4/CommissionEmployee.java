package lesson5.problem4;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class CommissionEmployee extends Employee {

	double grossSales;
	double CommisionRate;

	CommissionEmployee(String firstName, String lastName, String ssn, double grossSales, double crate) {
		super(firstName, lastName, ssn);
		this.grossSales = grossSales;
		this.CommisionRate = crate;
	}

	@Override
	public double getPayment() {
		return this.grossSales * this.CommisionRate;
	}

	public double getGrossSales() {
		return this.grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommisionRate() {
		return this.CommisionRate;
	}

	public void setCommisionRate(double commisionRate) {
		this.CommisionRate = commisionRate;
	}

	// to ask professor - this vs super
	@Override
	public String toString() {
		return "first name: " + this.getFirstName() + ", last name: " + this.getLastName() + ", SSN: "
				+ this.getSocialSecurityNumber() + ", Gross sales: " + this.getGrossSales() + ", commision rate: "
				+ this.getCommisionRate();
	}

}
