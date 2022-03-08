package hwsort.taskc;

import java.time.LocalDate;
import java.util.Date;

public class Secretary extends DeptEmployee {
	private double netSalary;
	private double overtimeHours;
	public Secretary(String name, double salary, LocalDate hireDate, double overtimeHours){
		super(name,salary,hireDate);
		this.overtimeHours = overtimeHours;
	}
	public double getOvertimeHours() {
		return overtimeHours;
	}
	
	//overrides superclass method
	public double getSalary() {
		netSalary = super.getSalary() + 12*overtimeHours;
		return netSalary;
	}
	@Override
	public String toString() {
		return "name=" + super.getName() + ", salary=" + netSalary + ", hireDate=" + super.getHireDate();
	}
}
