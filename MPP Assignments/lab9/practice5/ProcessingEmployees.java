package lab9.practice5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lab9.practice4.Employee;

public class ProcessingEmployees {
	public static void main(String[] args) {
		// initialize array of Employees
		Employee[] employees = { new Employee("Jason", "Red", 5000, "IT"), new Employee("Ashley", "Green", 7600, "IT"),
				new Employee("Matthew", "Indigo", 3587.5, "Sales"), new Employee("Indigo", "Indigo", 3587.5, "Sales"),
				new Employee("Indra", "Matthew", 3587.5, "Sales"),
				new Employee("James", "Indigo", 4700.77, "Marketing"), new Employee("Luke", "Indigo", 6200, "IT"),
				new Employee("Jason", "Blue", 3200, "Sales"), new Employee("Wendy", "Brown", 4236.4, "Marketing") };

		// get List view of the Employees
		List<Employee> list = Arrays.asList(employees);

		// display all Employees
		System.out.println("Complete Employee list:");
		list.stream().forEach(System.out::println); // A method reference.

		// implement here

// 1) Display Employees with salaries in the range $4000-$6000 sorted into ascending order by salary.

		System.out.println("\n1. ---------\n");

		List<Employee> firstlist = list.stream().filter(n -> n.getSalary() >= 4000 && n.getSalary() <= 6000)
				.sorted((s1, s2) -> (int) (s1.getSalary() - s2.getSalary())).collect(Collectors.toList());

		firstlist.forEach(System.out::println);

// 2) Display first Employee with salary in the range $4000-$6000. 

		System.out.println("\n2. ---------\n");

		list.stream().filter(n -> n.getSalary() >= 4000 && n.getSalary() <= 6000).limit(1).forEach(System.out::println);

// 3) Create two types of Function (functional interfaces) for getting first and last names from an Employee. Create a
//	type of Comparator for comparing Employees by first name then last name. Sort employees by last name, then 
//	first name using created types. 

		System.out.println("\n3. ---------\n");

		Function<Employee, String> fname = n -> n.getFirstName();
		Function<Employee, String> lname = n -> n.getLastName();
		Comparator<Employee> nameComparator = Comparator.comparing(fname).thenComparing(lname);

		list.stream().sorted(nameComparator).forEach(System.out::println);

// 4) Sort employees in descending order by last name, then first name. 

		System.out.println("\n4. ---------\n");

		Function<Employee, String> fname1 = n -> n.getFirstName();
		Function<Employee, String> lname1 = n -> n.getLastName();
		Comparator<Employee> nameComparator1 = Comparator.comparing(lname1).thenComparing(fname1);

		list.stream().sorted(nameComparator1.reversed()).forEach(System.out::println);

// 5) Display unique employee last names sorted.

		System.out.println("\n5. ---------\n");

		list.stream().map((Employee n) -> n.getLastName()).distinct().sorted().forEach(System.out::println);

// 6) Display only first and last names. 

		System.out.println("\n6. ---------\n");

		list.stream().map((Employee e) -> e.getFirstName() + " " + e.getLastName()).forEach(System.out::println);

// 7) Print out all the distinct last names whose last name starts with I.   

		System.out.println("\n7. ---------\n");

		list.stream().map(n -> n.getLastName()).filter(e -> e.startsWith("I")).distinct().forEach(System.out::println);
	}
}