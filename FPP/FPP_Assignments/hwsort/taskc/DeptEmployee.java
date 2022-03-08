package hwsort.taskc;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;

public class DeptEmployee {

	private String name;
	private double salary;
	private LocalDate hireDate;

	public DeptEmployee(String name, double salary, LocalDate hireDate) {
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	// sorting
	private void sort(DeptEmployee[] emp) {
		
		class NameComparator implements Comparator<DeptEmployee> {

			@Override
			public int compare(DeptEmployee o1, DeptEmployee o2) {
				return Double.compare(o1.getSalary(), o2.getSalary());
			}

		}
	}

	// default implementation
	public double getSalary() {
		return salary;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	@Override
	public String toString() {
		return "name=" + name + ", salary=" + salary + ", hireDate=" + hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
