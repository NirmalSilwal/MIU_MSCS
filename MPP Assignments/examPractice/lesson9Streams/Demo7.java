package examPractice.lesson9Streams;

import java.util.Optional;

public class Demo7 {

	// creating our own Optional

	public static Optional<Double> inverse(Double val) {

		return val == null || val == 0 ? Optional.empty() : Optional.of(1 / val);
	}

	public static void main(String[] args) {

		// test 1
		Optional<Double> inverseResult = inverse(5.0);

		if (inverseResult.isPresent())
			System.out.println(inverseResult.get());
		else
			System.out.println("no element found");

		// test 2
		Optional<Double> inverse2 = inverse(0.0);
		System.out.println(inverse2.orElse(0.0));

		// test 3
		Optional<Double> inverse3 = inverse(null);
		System.out.println(inverse3.orElse(null));

// orElseGet
		Optional<Double> example = Optional.ofNullable(null);
//		System.out.println(example.get()); // it will give no such element exception

		System.out.println("test - " + example.orElse(12.70));
		System.out.println(example.orElse(null));

//		orElseGet - if there is non null value print the value, or else print the random number

		System.out.println(example.orElseGet(Math::random));

//		System.out.println(example.orElseGet(1.1)); // compiler error - it requires Supplier interface

		
	}
}
