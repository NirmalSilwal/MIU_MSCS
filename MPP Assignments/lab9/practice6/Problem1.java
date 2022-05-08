package lab9.practice6;

import java.util.Random;
import java.util.function.Supplier;

public class Problem1 {

	// name and type of lambda goes here
	Random r = new Random();
	Supplier<Integer> random = () -> r.nextInt();

	// representing lambda as a method reference
	// Hint: To define the method reference, make use of a helper method.

	Supplier<Integer> random1 = Problem1::generateRandNum;

	public static int generateRandNum() {
		Random num = new Random();
		return num.nextInt();
	}

	// representing lambda as a static nested class
	public static class RandomGeneratedNestedClass implements Supplier<Integer> {
		@Override
		public Integer get() {
			Random randNum = new Random();
			return randNum.nextInt();
		}
	}

	public void evaluator() {
		System.out.println(random.get());
		System.out.println(random1.get());
		System.out.println(new RandomGeneratedNestedClass().get());
	}

	public static void main(String[] args) {
		Problem1 p = new Problem1();
		p.evaluator();
	}

}
