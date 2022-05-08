package lab8.assignment.problem2.problem2a;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.salary == e2.salary) return 0;
		else if(e1.salary < e2.salary) return -1;
		else return 1;
	}
}