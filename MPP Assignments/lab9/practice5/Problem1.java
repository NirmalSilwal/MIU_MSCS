package lab9.practice5;

import java.util.function.BiPredicate;

public class Problem1 {

	// name and type of lambda goes here
	BiPredicate<Integer, Integer> checkless = (x, y) -> x + y < x * y;

	// representing lambda as a method reference
	// Hint: To define the method reference, make use of a helper method.
	BiPredicate<Integer, Integer> checkless2 = new Problem1.MyNestedClass()::test;

	// representing lambda as a static nested class
	static class MyNestedClass implements BiPredicate<Integer, Integer> {

		public boolean test(Integer x, Integer y) {
			return x + y < x * y;
		}
	}

	// evaluate with String inputs: 2, 3
	public void evaluator() {
		System.out.println(checkless.test(2, 3));
		System.out.println(checkless2.test(2, 3));
		System.out.println(new MyNestedClass().test(2, 3));
	}

	public static void main(String[] args) {
		Problem1 p = new Problem1();
		p.evaluator();
	}
}
