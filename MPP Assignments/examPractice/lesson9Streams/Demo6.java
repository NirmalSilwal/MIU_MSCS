package examPractice.lesson9Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo6 {

	public static void main(String[] args) {

		// terminal operations

// example 1
		List<String> words = Arrays.asList("Hello", "Queen", "MPP", "javaCode", "Nirmal");

		Optional<String> largest = words.stream().max(String::compareToIgnoreCase);

		if (largest.isPresent())
			System.out.println(largest.get());

// example 2
		List<String> names = new ArrayList<String>(
				Arrays.asList("java", "Apache", "python", "Andriod", "ruby", "Angular"));

		Optional<String> startsWithZ = names.stream().filter(n -> n.startsWith("Z"))
//				.findFirst();
				.findAny();

//		 System.out.println("starts with z: " + startsWithZ.get()); //NoSuchElementException

// example 3

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 56, 7, 8, 97);

		Optional<Integer> maxvalue = nums.stream().max(Integer::compareTo);

		// System.out.println(maxvalue);

// deal with NULL

		// regular imperative approach - isPresent()
		if (maxvalue.isPresent())
			System.out.println("max value is: " + maxvalue.get());
		else
			System.out.println("no match");

		// functional approach
		System.out.println(startsWithZ.orElse("no such element starting with Z"));

// example - ifPresent()
		List<Integer> evens = Arrays.asList(2, 4, 6, 8, 10, 12, 22, 24, 46);

		evens.stream().filter(n -> n > 10).findAny().ifPresent(x -> System.out.println(x));

	}

}
