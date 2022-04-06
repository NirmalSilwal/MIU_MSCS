package lab4.problem3;

public abstract class Employee {

	private String empId;

	public abstract double calcGrossPay(int month, int yr);

	public void print() {

	}

	public Paycheck calcCompensation(int month, int year) {
		Paycheck paycheck = new Paycheck(calcGrossPay(month, year));
		return paycheck;
	} 

}
