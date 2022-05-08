package lab8.assignment.problem6.inclassExcercise;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import lab4.problem3.Employee;

public class Examples {

	/*
	// type: Class::instanceMethod
	Function<String, String> upper1 = (String x) -> x.toUpperCase();
	Function<String, String> upper2 = String::toUpperCase;

//	A. (Employee e) -> e.getName()

	// type: Class::instanceMethod
	Function<Employee, String> emp1 = e -> e.getName();
	Function<Employee, String> emp2 = Employee::getName;

//	B. (Employee e,String s) -> e.setName(s)

	// type: Class::instanceMethod
	BiConsumer<Employee, String> emp3 = (e, s) -> e.setName(s);
	BiConsumer<Employee, String> emp4 = Employee::setName;

//	C. (String s1,String s2) -> s1.compareTo(s2)

	// type: Class::instanceMethod
	Comparator<String> comp1 = (s1, s2) -> s1.compareTo(s2);
	Comparator<String> comp2 = String::compareTo;

//	D. (Integer x,Integer y) -> Math.pow(x,y)

	// type: Class::staticMethod
	BiFunction<Integer, Integer, Double> power1 = (x, y) -> Math.pow(x, y);
	BiFunction<Integer, Integer, Double> power2 = Math::pow;

//	E. (Apple a) -> a.getWeight()

	// type: Class::instanceMethod
	Function<Apple, Double> wt1 = a -> a.getWeight();
	Function<Apple, Double> wt2 = Apple::getWeight;

//	F. (String x) -> Integer.parseInt(x);

	// type: Class::staticMethod
	Function<String, Integer> parse1 = x -> Integer.parseInt(x);
	Function<String, Integer> parse2 = Integer::parseInt;

//	G. (Employee e1, Employee e2) -> comp.compare(e1,e2)

	// type: object::instanceMethod
	EmployeeNameComparator comp = new EmployeeNameComparator();
	Comparator<Employee> comp3 = (e1, e2) -> comp.compare(e1, e2);
	Comparator<Employee> comp4 = comp::compare;

	public void evaluator() {
		System.out.println(upper2.apply("hello"));

		// A
		System.out.println(emp2.apply(new Employee("testing")));

		// B
		emp4.accept(new Employee("testing"), "nirmal");

		// C
		comp2.compare("hello", "olleh");

		// D
		power2.apply(2, 3);

		// E
		System.out.println(wt2.apply(new Apple(3)));

		// F
		System.out.println(parse2.apply("1234"));

		// G
		System.out.println(comp4.compare(new Employee("hello"), new Employee("hello2")));
	}

	public static void main(String[] args) {
		Examples e = new Examples();
		e.evaluator();

	}
*/
}
