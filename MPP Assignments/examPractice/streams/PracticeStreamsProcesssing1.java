package examPractice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeStreamsProcesssing1 {
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
		System.out.println("Complete Employee list:\n");
		
		list.stream().forEach(System.out::println);

		System.out.println("\n1.---------\n");

		/* practice code here */

		
// 1) Print out only the first names of all the employees.

//		list.stream().forEach(n -> System.out.println(n.getFirstName()));

		// another approach
//		list.stream().map(n -> n.getFirstName()).forEach(System.out::println); // using method reference
//		list.stream().map(n -> n.getFirstName()).forEach(name -> System.out.println(name)); // using lambda


		
		
// 2) Count the number of last names that begin with the letter ‘B’. Print out this number.
		System.out.println("\n2. ---------\n");

		long count = list.stream().filter(n -> n.getLastName().startsWith("B")).count();
		System.out.println("ans: " + count);
		
		
//3) Print out all the Employee objects whose last name begins with the letter ‘B’. 
		System.out.println("\n3. ---------\n");

//		list.stream().filter(n -> n.getLastName().startsWith("B")).forEach(System.out::println);
		
	
		
// 4) Print out All of the employee objects, but if the last name begins with the letter ‘I’, then capitalize all the letters in the last name. 		
		System.out.println("\n4. ---------\n");

		Stream<Employee> allemps = list.stream().map(e -> {
			Employee modifiedEmp = new Employee(e.getFirstName(), e.getLastName(), e.getSalary(), e.getDepartment());
			if (modifiedEmp.getLastName().startsWith("I"))
				modifiedEmp.setLastName(modifiedEmp.getLastName().toUpperCase());
			return modifiedEmp;
		});
		
//		allemps.forEach(System.out::println);
		
		
		System.out.println("\n---**** short way ---\n");
		
		Stream<Employee> ss = list.stream().map(e -> {
					if (e.getLastName().startsWith("I"))
						e.setLastName(e.getLastName().toUpperCase());
					return e;
				});
//		ss.forEach(System.out::println);
		
		
		
// 5) Create a List<Employee> the Employee objects whose last name begins with the letter ‘G’ and their first name and last name to be All capital letters.		
		System.out.println("\n5.---------\n");

		Stream<Employee> fifthans = list.stream().filter(n -> n.getLastName().startsWith("G")).map(emp -> {
			emp.setFirstName(emp.getFirstName().toUpperCase());
			emp.setLastName(emp.getLastName().toUpperCase());
			
			return emp;
		});
		
//		List<Employee> f = fifthans.collect(Collectors.toList());
//		List<Employee> f = fifthans.toList();
//		System.out.println(f);
		
		fifthans.forEach(System.out::println);
		System.out.println("---***---");
		
		
		
//		Stream<Employee> fifthlist = list.stream().map(x -> {
//
//			Employee employee = new Employee(x.getFirstName(), x.getLastName(), x.getSalary(), x.getDepartment());
//
//			if (employee.getLastName().startsWith("G")) {
//				employee.setFirstName(employee.getFirstName().toUpperCase());
//				employee.setLastName(employee.getLastName().toUpperCase());
//			}
//			return employee;
//		});
//
//		List<Employee> finalList = fifthlist.filter(n -> n.getLastName().startsWith("G")).collect(Collectors.toList());
//
//		finalList.forEach(System.out::println);

		
// 6) Print out all the Employee objects’ last names, whose last name begins with the letter ‘I’, but First name does not begin with the letter ‘I’. Print out only the last names. 		

		System.out.println("\n6. ---------\n");

//		list.stream().filter(n -> n.getLastName().startsWith("I") && !n.getFirstName().startsWith("I")).forEach(System.out::println);
		
		list.stream()
			.filter(n -> n.getLastName().startsWith("I") && !n.getFirstName().startsWith("I"))
			.map(e -> e.getLastName()).forEach(System.out::println);

		System.out.println("---***---");

		
		
//		List<Employee> sixthlist = list.stream()
//				.filter(n -> n.getLastName().startsWith("I") && !n.getFirstName().startsWith("I"))
//				.collect(Collectors.toList());
//
//		sixthlist.stream().forEach(n -> System.out.println(n.getLastName()));

		
// 7) Create an infinite stream of even numbers (0, 2, 4, …) and then, eventually print out only the first 20 even numbers from this stream. 		

		System.out.println("\n7. ---------\n");

		// prints first 5 odd numbers from infinite streams
		Stream.iterate(1, n -> n + 2).limit(5).forEach(System.out::println);
		
		System.out.println("---***---");

		
		Stream<Integer> infiniteStreamEven = Stream.iterate(0, n -> n + 2);

		infiniteStreamEven.limit(20).forEach(System.out::println);

		
// 8) Display Employees with salaries in the range $4000-$6000.
		System.out.println("\n8. ---------\n");

		list.stream().filter(e -> e.getSalary() > 4000 && e.getSalary() < 6000).forEach(System.out::println);
		
		
		System.out.println("---***---");

		
		
//		List<Employee> eightlist = list.stream().filter(n -> n.getSalary() >= 4000 && n.getSalary() <= 6000)
//				.collect(Collectors.toList());
//
//		eightlist.forEach(System.out::println);

		
// 9) Display Employees in IT department.   
		System.out.println("\n9. ---------\n");

		list.stream().filter(emp -> emp.getDepartment().equals("IT")).forEach(System.out::println);
		
		
		System.out.println("---***---");

		
		
//		List<Employee> ninthlist = list.stream().filter(n -> n.getDepartment().equals("IT"))
//				.collect(Collectors.toList());
//
//		ninthlist.forEach(System.out::println);
	}
}