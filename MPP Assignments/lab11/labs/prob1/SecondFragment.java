package lab11.labs.prob1;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment {

	public static void main(String[] args) {

		List<Integer> ints = new ArrayList<>();

		ints.add(1);
		ints.add(2);

		List<? extends Number> nums = ints;

		// nums.add(3.14); // this line will give compile time error (get and put rule)
		
	}
}
