package examPractice.streams;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class PracticeStreamsProcessing3 {

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
		System.out.println("displaying all employees data - \n");

		list.stream().forEach(System.out::println); // A method reference.

		// implement here
		
		

// 1) Use the Collectors.joining method to print out All Employee objects, and separate each one with a delimiter of “---\n---“.

		System.out.println("\n1.--------------------------------------\n");

		System.out.println(list.stream().map(Employee::toString).collect(Collectors.joining("--\n--")));
		
		System.out.println("\n------******------\n");
		
//		String result = list.stream().map(Employee::toString).collect(Collectors.joining("--\n--"));
//		System.out.println(result);

		
		
// 2) Print a list of both the capital and non capital last names of employees using stream concatenation.

		System.out.println("\n2.--------------------------------------\n");
		
//		list.stream().map(n -> n.getLastName().toUpperCase().concat("\n").concat(n.getLastName()))
//			.forEach(System.out::println);
		
		Stream<String> capitalx = list.stream().map(n -> n.getLastName().toUpperCase());
		Stream<String> noncapitalx = list.stream().map(n -> n.getLastName());
		
//		Stream<String> ansx = Stream.concat(capitalx, noncapitalx);
//		ansx.forEach(System.out::println);
		Stream.concat(capitalx, noncapitalx).forEach(System.out::println);
		
		System.out.println("\n------******------\n");

		

		Stream.concat(list.stream().map(x -> x.getLastName()), list.stream().map(x -> x.getLastName().toUpperCase()))
				.forEach(System.out::println);

		
		
// 3) Sum of Employee salaries with DoubleStream sum method

		System.out.println("\n3.--------------------------------------\n");

		DoubleStream dsx = list.stream().mapToDouble(Employee::getSalary);
		System.out.println(dsx.sum());

		DoubleSummaryStatistics sxx = list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println(sxx.getSum());

		
		
		System.out.println("\n------******------\n");

		
		
		DoubleStream dstream = list.stream().mapToDouble(x -> x.getSalary());
		System.out.println(dstream.sum());

		// using DoubleSummaryStatictics
		DoubleSummaryStatistics summary = list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println(summary.getSum());
		
		
		
// 4) Calculate sum of Employee salaries with Stream reduce method

		System.out.println("\n4.--------------------------------------\n");

		double sumsalx = list.stream().map(e -> e.getSalary()).reduce(0.0, (x, y) -> x + y);
		System.out.println(sumsalx);
		
		System.out.println("\n------******------\n");

		double sumOfSalary = list.stream().map(Employee::getSalary).reduce(0.0, (x, y) -> x + y);
		System.out.println(sumOfSalary);

		
		
// 5) Average of Employee salaries with DoubleStream average method.

		System.out.println("\n5.--------------------------------------\n");
		
		DoubleStream dssxx = list.stream().mapToDouble(Employee::getSalary);
		System.out.println(dssxx.average().getAsDouble());
		
		
		System.out.println("\n------******------\n");


//		DoubleSummaryStatistics summary1 = list.stream().collect(Collectors.summarizingDouble(x -> x.getSalary()));
//		System.out.println(summary1.getAverage());
		
		// another way using OptionalDouble
//		OptionalDouble doubleval = list.stream().mapToDouble(x -> x.getSalary()).average();
//		doubleval.ifPresent(x -> System.out.println(x));

		
		
// 6) Count number of Employees in each department
		System.out.println("\n6.--------------------------------------\n");


		Map<String, Long> mymap = list.stream()
									.collect(Collectors.groupingBy(d -> d.getDepartment(), Collectors.counting()));
		System.out.println(mymap);

		
		System.out.println(list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())));
		
		System.out.println("\n------******------\n");

		
//		Map<String, Long> myMap = list.stream()
//				.collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.counting()));
//		System.out.println(myMap);

		
		
// 7) Print out each department and the average salary for the department
		System.out.println("\n7.--------------------------------------\n");

		System.out.println(list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary))));	

		
		
		
		System.out.println("\n------******------\n");

		
		
//		Map<String, Double> myMap1 = list.stream()
//				.collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.averagingDouble(e -> e.getSalary())));
//		System.out.println(myMap1);

		
		
// 8) Print out each department and all of the employees who work at that department.

		System.out.println("\n8.--------------------------------------\n");

		list.stream().collect(Collectors.groupingBy(Employee::getDepartment))
						.forEach((k, v) -> System.out.println(k + " -> " + v));
		
		System.out.println("\n------******------\n");

		
		Map<String, List<Employee>> myMap2 = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList()));
		
		myMap2.forEach((x, y) -> {
			System.out.println(x);
			y.stream().forEach(System.out::println);
			System.out.println();
		});

	}
}