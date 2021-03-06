package examPractice.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeStreamsProcessing2 {
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

		// practice code here

// 1) Display Employees with salaries in the range $4000-$6000 sorted into ascending order by salary.

		System.out.println("\n1. ---------\n");

		list.stream().filter(emp -> emp.getSalary() >= 4000 && emp.getSalary() <= 6000)
					.sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
		
		System.out.println("\n-------*******---------\n");

		// salary in descending order to same problem
		list.stream().filter(emp -> emp.getSalary() >= 4000 && emp.getSalary() <= 6000)
					.sorted((e1, e2) -> (int)(e2.getSalary() - e1.getSalary()))
					.forEach(System.out::println);
		
		System.out.println("\n-------*******---------\n");
		
		
		
//		List<Employee> firstlist = list.stream().filter(n -> n.getSalary() >= 4000 && n.getSalary() <= 6000)
//										.sorted((s1, s2) -> (int) (s1.getSalary() - s2.getSalary()))
//										.collect(Collectors.toList());
//		firstlist.forEach(System.out::println);

// 2) Display first Employee with salary in the range $4000-$6000. 

		System.out.println("\n2. ---------\n");
		
		Optional<Employee> fe = list.stream()
									.filter(emp -> emp.getSalary() >= 4000 && emp.getSalary() <= 6000)
									.findFirst();

		System.out.println(fe.get());
		
		
		
		System.out.println("\n-------*******---------\n");


		list.stream().filter(n -> n.getSalary() >= 4000 && n.getSalary() <= 6000).limit(1).forEach(System.out::println);

// 3) Create two types of Function (functional interfaces) for getting first and last names from an Employee. Create a
//	type of Comparator for comparing Employees by first name then last name. Sort employees by last name, then 
//	first name using created types. 

		System.out.println("\n3. ---------\n");

//		Function<Employee, String> f1 = e -> e.getFirstName();
//		Function<Employee, String> f2 = e -> e.getLastName();
//		Comparator<Employee> empComp = Comparator.comparing(f1).thenComparing(f2);
//		
//		list.stream().sorted(empComp.reversed()).forEach(System.out::println);
		
		System.out.println("\n-------*******---------\n");

		Function<Employee, String> fname = n -> n.getFirstName();
		Function<Employee, String> lname = n -> n.getLastName();
		Comparator<Employee> nameComparator = Comparator.comparing(fname).thenComparing(lname);

		list.stream().sorted(nameComparator).forEach(System.out::println);

// 4) Sort employees in descending order by last name, then first name. 

		System.out.println("\n4. ---------\n");

		list.stream()	
			.sorted(Comparator.comparing(Employee::getLastName).thenComparing(Employee::getFirstName).reversed())
			.forEach(System.out::println);

		System.out.println("\n-------*******---------\n");
		
		
		list.stream().sorted(Comparator.comparing(Employee::getLastName, Comparator.reverseOrder())
										.thenComparing(Employee::getFirstName, Comparator.reverseOrder()))
										.forEach(System.out::println);
								
		
		System.out.println("\n-------*******---------\n");

		Function<Employee, String> fname1 = n -> n.getFirstName();
//		Function<Employee, String> lname1 = n -> n.getLastName();
		Comparator<Employee> nameComparator1 = Comparator.comparing(Employee::getLastName).thenComparing(fname1);

		list.stream().sorted(nameComparator1.reversed()).forEach(System.out::println);

// 5) Display unique employee last names sorted.

		System.out.println("\n5. ---------\n");

		list.stream().map(n -> n.getLastName()).distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		System.out.println("\n-------*******---------\n");

		
		list.stream().map(n -> n.getLastName()).distinct().sorted().forEach(System.out::println);

		// in reverse order
//		list.stream().map(n -> n.getLastName()).distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);

// 6) Display only first and last names. 

		System.out.println("\n6. ---------\n");

		list.stream().map(n -> n.getFirstName() + " " + n.getLastName())
					.forEach(System.out::println);
		
		System.out.println("\n-------*******---------\n");


		list.stream().map(e -> e.getFirstName() + " " + e.getLastName())
			.forEach(System.out::println);

// 7) Print out all the distinct last names whose last name starts with I.   

		System.out.println("\n7. ---------\n");

		list.stream().map(n -> n.getLastName())
				.filter(e -> e.startsWith("I"))
				.distinct()
				.forEach(System.out::println);
	}
}