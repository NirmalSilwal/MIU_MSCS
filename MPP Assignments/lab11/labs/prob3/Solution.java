package lab11.labs.prob3;

import java.util.Collection;

public class Solution {

	// given example from lecture
	public static double sum(Collection<? extends Number> nums) {
		double s = 0.0;
		for (Number num : nums)
			s += num.doubleValue();
		return s;
	}

	/*
		// part a
		 
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		List<? extends Number> nums = ints;
		double dbl = sum(nums);
		nums.add(3.14); // this line gives compile time error because of extends keyword
	
	
		// part b
		 
		List<Object> objs = new ArrayList<>();
		objs.add(1);
		objs.add("two");
		List<? super Integer> ints = objs;
		ints.add(3);
		double dbl = sum(ints); // this line gives compile time error
	
	*/
}
