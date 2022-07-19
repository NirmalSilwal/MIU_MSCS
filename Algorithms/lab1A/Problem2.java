package lab1A;

public class Problem2 {

	// brute force way to solve this problem would be to sort the array and return
	// the 1st index element, this would be O(NlogN) time solution

	// optimal approach: O(N) Time, O(1) Space
	public static int secondSmallest(int[] arr) {
		if (arr == null || arr.length < 2) {
			throw new IllegalArgumentException("Input array too small");
		}
		// implement
		int firstSmallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		if (arr[0] < arr[1]) {
			firstSmallest = arr[0];
			secondSmallest = arr[1];
		} else {
			firstSmallest = arr[1];
			secondSmallest = arr[0];
		}

		for (int i = 2; i < arr.length; i++) {

			if (arr[i] < firstSmallest) {
				secondSmallest = firstSmallest;
				firstSmallest = arr[i];

			} else if (arr[i] > firstSmallest && arr[i] < secondSmallest) {
				secondSmallest = arr[i];
			}
		}

		return secondSmallest;
	}

	public static void main(String[] args) {

		System.out.println(secondSmallest(new int[] { 1, 4, 2, 3 })); // 2
		System.out.println(secondSmallest(new int[] { 3, 3, 4, 7 })); // 3
		System.out.println(secondSmallest(new int[] { 10, 40, 2, -3 })); // 2
		System.out.println(secondSmallest(new int[] { -1, 4, -2, 3 })); // -1
//		System.out.println(secondSmallest(new int[] { 9 })); // will throw exception for this input
	}
}
