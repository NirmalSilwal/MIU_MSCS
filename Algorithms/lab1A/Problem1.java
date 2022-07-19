package lab1A;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {

	// Approach 1
	// brute force solution - O(N^2) time, O(1) space, N is the size of the array
	// for larger inputs, this approach will take more time and is not efficient one

	public static boolean sumFound(int[] arr, int z) {

		if (arr == null || arr.length < 2) {
			return false;
		}
		// implement
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == z && arr[i] != arr[j])
					return true;
			}
		}

		return false;
	}

	// Approach 2
	// optimal solution - O(N) time, O(N) space using HashMap
	public static boolean sumFound2(int[] arr, int z) {

		if (arr == null || arr.length < 2) {
			return false;
		}
		// implement

		// keeping track of all array elements in hashmap
		Map<Integer, Integer> map = new HashMap<>(); // storing number and it's count in map

		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}

		for (int i = 0; i < arr.length; i++) {

			int remainingSum = z - arr[i];

			if (map.containsKey(remainingSum) && map.get(remainingSum) == 1) { // check if it's count is also 1
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println(sumFound(new int[] { 1, 4, 2, 3 }, 5)); // true

		System.out.println(sumFound(new int[] { 3, 3, 4, 7 }, 6)); // false

		System.out.println(sumFound(new int[] { 1 }, 2)); // false

		// testing 2nd approach
		System.out.println();

		System.out.println(sumFound2(new int[] { 1, 4, 2, 3 }, 5)); // true

		System.out.println(sumFound2(new int[] { 3, 3, 4, 7 }, 6)); // false

		System.out.println(sumFound2(new int[] { 1 }, 2)); // false

	}

}