package lab4.problem3;

final public class Paycheck {

	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;

	public Paycheck(double grossPay) {
		this.grossPay = grossPay;
		
		fica = (23 / 100) * grossPay;
		state = (5 / 100) * grossPay;
		local = (1 / 100) * grossPay;
		medicare = (3 / 100) * grossPay;
		socialSecurity = (7.5 / 100) * grossPay;
	}

	public void print() {

	}

	public double getNetPay() {
		return this.grossPay - fica - state - local - medicare - socialSecurity;
	}

	public double getGrossPay() {
		return grossPay;
	}

	public double getFica() {
		return fica;
	}

	public double getState() {
		return state;
	}

	public double getLocal() {
		return local;
	}

	public double getMedicare() {
		return medicare;
	}

	public double getSocialSecurity() {
		return socialSecurity;
	}

}
