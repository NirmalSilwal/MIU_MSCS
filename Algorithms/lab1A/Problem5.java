package lab1A;

// Searching algorithm

public class Problem5 {

	// Part A

	// doing linear search - O(N) time, O(1) space

	public static boolean find(int[] arr, int z) {
		// implement

		for (int num : arr) {
			if (num == z)
				return true;
		}

		return false;
	}

	// Part B

	/*
	 * Now assuming the given array is sorted, we can optimize the solution in Part
	 * A of linear searching using the binary searching technique. This is more
	 * optimal solution for sorted input case because in binary search we check our
	 * target value by comparing with the middle element of the array. Since the
	 * array is sorted, our search value can either be the middle value in sorted
	 * array or if the search value is less than middle value, then we can omit the
	 * middle right half of the array for search scan as we're sure that our search
	 * value must be in left half of the array and similarly for the search value
	 * more than middle value in the sorted array.
	 */

	// now implementing search functionality using binary search mechanism
	// here we're assuming input array is sorted
	public static boolean findOptimal(int[] arr, int z) {

		int low = 0, high = arr.length - 1;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (arr[mid] == z) {
				return true;
			} else if (z < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		System.out.println(find(new int[] { 2, 8, 3, 4 }, 3));
		System.out.println(find(new int[] { 2, 8, 3, 4 }, 5));
		System.out.println(find(new int[] { 2, 3, 4, 8 }, 3));
		System.out.println(find(new int[] { 2, 3, 4, 8 }, 5));

		// testing for sorted array
		System.out.println();
		System.out.println(findOptimal(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 7));
		System.out.println(findOptimal(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 3));
		System.out.println(findOptimal(new int[] { 2, 3, 4, 8 }, 5));
		System.out.println(findOptimal(new int[] { 2, 3, 4, 8 }, 3));
	}

}
