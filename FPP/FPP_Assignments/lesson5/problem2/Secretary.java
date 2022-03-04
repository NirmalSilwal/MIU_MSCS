package lesson5.problem2;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Secretary extends DeptEmployee {

	private double overtimeHours;

	Secretary(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		this.overtimeHours = 0;
	}

	public double getOvertimeHours() {
		return this.overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	@Override
	public double computeSalary() {
		double totalsalary = super.computeSalary() + 12 * this.overtimeHours;
		return totalsalary;
	}

}
