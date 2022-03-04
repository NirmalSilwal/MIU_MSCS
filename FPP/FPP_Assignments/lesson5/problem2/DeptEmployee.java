package lesson5.problem2;

import java.time.LocalDate;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class DeptEmployee {

	private String name;
	private double salary;
	private LocalDate hiredate;

	DeptEmployee(String name, double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		this.hiredate = LocalDate.of(year, month, day);
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHiredate() {
		return this.hiredate;
	}

	// to ask to professor
	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}
	
	public double computeSalary() {
		return this.salary;
	}
}
