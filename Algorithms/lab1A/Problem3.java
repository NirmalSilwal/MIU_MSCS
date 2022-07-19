package lab1A;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import lab1.powerset.PowerSet;

public class Problem3 {

	public static boolean sumFound(List<Integer> list, int k) {
		// implement

		// edge case
		if (k == 0)
			return true;

		// using given jar file of PowerSet to compute all subsets of list
		List<Set<Integer>> powerset = PowerSet.powerSet(list);

		for (Set<Integer> set : powerset) {

			int currentSum = computeSum(set);

			if (currentSum == k)
				return true;
		}

		return false;
	}

	// helper method to find sum of given set
	private static int computeSum(Set<Integer> arr) {
		int sum = 0;
		for (int n : arr) {
			sum += n;
		}
		return sum;
	}

	public static void main(String[] args) {

		// 1, 3, 9, 4, 8, 5
		List<Integer> list = new ArrayList<Integer>() {
			private static final long serialVersionUID = 1L;
			{
				add(1);
				add(3);
				add(9);
				add(4);
				add(8);
				add(5);
			}
		};

//		System.out.println(sumFound(list, 21));
//		System.out.println(sumFound(list, 22));
		System.out.println(sumFound(list, 31));
//		System.out.println(sumFound(list, 0));
	}

}