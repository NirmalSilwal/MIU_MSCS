package lab11.labs.prob1;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment {

	public static void main(String[] args) {

		List<Integer> ints = new ArrayList<>();

		ints.add(1);
		ints.add(2);

		// List<Number> nums = ints; // this line will give compile time error (no covariant)

		// solution for this is
		List<? extends Number> nums = ints;

		// nums.add(3.14); // this will also give error because nums expects Integer
		// value and we're providing double value
	}
}
