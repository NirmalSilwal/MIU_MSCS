package lab8.assignment.problem2.problem2a;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		EmployeeSalaryComparator salaryComparator = new EmployeeSalaryComparator();
		if (e1.equals(e2))
			return 0;
		else if (e1.name.compareTo(e2.name) == 0 && salaryComparator.compare(e1, e2) == 1)
			return 1;
		else
			return -1;
	}
}
