package lab2A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem4B {

	// O(N) time and space
	public static ArrayList<Integer> removeDuplicates(int[] list) {

		if (list.length == 0 || list == null) {
			return null;
		}

		Map<Integer, Integer> map = new HashMap<>();

		for (int n : list) {
			if (!map.containsKey(n)) {
				map.put(n, 1);
			} else {
				map.put(n, map.get(n) + 1);
			}
		}

		ArrayList<Integer> result = new ArrayList<Integer>(map.keySet());

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 2, 1, 4, 2, 5, 6, 3 };

		System.out.println("Original array: ");
		System.out.println(Arrays.toString(arr));

		ArrayList<Integer> ans = removeDuplicates(arr);

		System.out.println("\nArray after removing duplicates: ");
		System.out.println(ans);
	}
}
