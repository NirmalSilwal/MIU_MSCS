package lab9.practice4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingEmployees {
	public static void main(String[] args) {
		// initialize array of Employees
		Employee[] employees = { 
				new Employee("Jason", "Red", 5000, "IT"), 
				new Employee("Ashley", "Green", 7600, "IT"),
				new Employee("Matthew", "Indigo", 3587.5, "Sales"), 
				new Employee("Indigo", "Indigo", 3587.5, "Sales"),
				new Employee("Indra", "Matthew", 3587.5, "Sales"),
				new Employee("James", "Indigo", 4700.77, "Marketing"), 
				new Employee("Luke", "Indigo", 6200, "IT"),
				new Employee("Jason", "Blue", 3200, "Sales"), 
				new Employee("Wendy", "Brown", 4236.4, "Marketing") 
				};

		// get List view of the Employees
		List<Employee> list = Arrays.asList(employees);

		// display all Employees
		System.out.println("Complete Employee list:");
		list.stream().forEach(System.out::println); // A method reference.

		System.out.println("\n1.---------\n");

		// implement here

// 1) Print out only the first names of all the employees.

		list.stream().forEach(n -> System.out.println(n.getFirstName()));

		
// 2) Count the number of last names that begin with the letter ‘B’. Print out this number.
		System.out.println("\n2. ---------\n");

		long total = list.stream().filter(n -> n.getLastName().startsWith("B")).count();

		System.out.println("total last names starting with letter 'B' is: " + total);

		
//3) Print out all the Employee objects whose last name begins with the letter ‘B’. 
		System.out.println("\n3. ---------\n");

		list.stream().filter(n -> n.getLastName().startsWith("B")).forEach(System.out::println);

		
// 4) Print out All of the employee objects, but if the last name begins with the letter ‘I’, then capitalize all the letters in the last name. 		
		System.out.println("\n4. ---------\n");

		Stream<Employee> myelist = list.stream().map(x -> {
			Employee employee = new Employee(x.getFirstName(), x.getLastName(), x.getSalary(), x.getDepartment());
			if (employee.getLastName().startsWith("I")) {
				employee.setLastName(employee.getLastName().toUpperCase());
			}
			return employee;
		});

		myelist.forEach(System.out::println);

		
// 5) Create a List<Employee> the Employee objects whose last name begins with the letter ‘G’ and their first name and last name to be All capital letters.		
		System.out.println("\n5.---------\n");

		Stream<Employee> fifthlist = list.stream().map(x -> {

			Employee employee = new Employee(x.getFirstName(), x.getLastName(), x.getSalary(), x.getDepartment());

			if (employee.getLastName().startsWith("G")) {
				employee.setFirstName(employee.getFirstName().toUpperCase());
				employee.setLastName(employee.getLastName().toUpperCase());
			}
			return employee;
		});

		List<Employee> finalList = fifthlist.filter(n -> n.getLastName().startsWith("G")).collect(Collectors.toList());

		finalList.forEach(System.out::println);

		
// 6) Print out all the Employee objects’ last names, whose last name begins with the letter ‘I’, but First name does not begin with the letter ‘I’. Print out only the last names. 		

		System.out.println("\n6. ---------\n");

		List<Employee> sixthlist = list.stream()
				.filter(n -> n.getLastName().startsWith("I") && !n.getFirstName().startsWith("I"))
				.collect(Collectors.toList());

		sixthlist.stream().forEach(n -> System.out.println(n.getLastName()));

		
// 7) Create an infinite stream of even numbers (0, 2, 4, …) and then, eventually print out only the first 20 even numbers from this stream. 		

		System.out.println("\n7. ---------\n");

		Stream<Integer> infiniteStreamEven = Stream.iterate(0, n -> n + 2);

		infiniteStreamEven.limit(20).forEach(System.out::println);

		
// 8) Display Employees with salaries in the range $4000-$6000.
		System.out.println("\n8. ---------\n");

		List<Employee> eightlist = list.stream().filter(n -> n.getSalary() >= 4000 && n.getSalary() <= 6000)
				.collect(Collectors.toList());

		eightlist.forEach(System.out::println);

		
// 9) Display Employees in IT department.   
		System.out.println("\n9. ---------\n");

		List<Employee> ninthlist = list.stream().filter(n -> n.getDepartment().equals("IT"))
				.collect(Collectors.toList());

		ninthlist.forEach(System.out::println);
	}
}