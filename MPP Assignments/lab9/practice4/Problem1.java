package lab9.practice4;

import java.util.Comparator;

public class Problem1 {

	public static void main(String[] args) {

		Problem1 p = new Problem1();
		p.evaluator();
	}
	
	// (String s1, String s2) -> s1.compareTo(s2)

	// name and type of lambda goes here
	Comparator<String> comp3 = (s1, s2) -> s1.compareTo(s2);

	// representing lambda as a method reference
	// Hint: To define the method reference, make use of a helper method.
	Comparator<String> comp4 = String::compareTo;

	// representing lambda as a static nested class
	Comparator<String> nestedComp = new NestedComparatorClass()::compare;

	static class NestedComparatorClass implements Comparator<String> {
		@Override
		public int compare(String o1, String o2) {
			return o1.compareTo(o2);
		}

	}

	// evaluate with String inputs: “Hello”, “Allo”
	public void evaluator() {
		System.out.println(comp3.compare("Hello", "Allo"));
		System.out.println(comp4.compare("Hello", "Allo"));
		System.out.println(nestedComp.compare("Hello", "Allo"));
	}
}
