package lab2B;

import java.util.Arrays;

// Interview Question: sort array with {0,1,2} elements only in O(n) time, O(1) space

public class Problem6 {

	/*
	 * This algorithm runs in O(n) time.
	 *
	 * Also we're doing the sorting in place where we take three pointers to track
	 * 0, 1 and 2 at various indexes in the given array.
	 * 
	 * When we find 0 at mid position we swap that with element at low index
	 * 
	 * When we find 1 at mid index we just move the mid pointer ahead.
	 * 
	 * When we find 2 at mid index, we swap it with element at high index and reduce
	 * high pointer by 1
	 * 
	 * this way we're using only one traversal inside for loop which is O(n) time
	 * for n elements traversals.
	 * 
	 * We're also not using extra space here, only space we used is for holding 3
	 * variable which are O(1) each so total space is O(1+1+1)=O(3) which is O(1)
	 * asymptotically after dropping constant 3.
	 * 
	 * Hence, it's time complexity is O(n) and space complexity is O(1).
	 */

	public static void sort(int[] arr) {

		int low = 0, high = arr.length - 1, mid = 0;

		while (mid <= high) {

			if (arr[mid] == 0) {
				swap(arr, low, mid);
				low++;
				mid++;
			} else if (arr[mid] == 2) {
				swap(arr, high, mid);
				high--;
			} else {
				mid++;
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 2, 1, 2, 0, 1, 2, 2, 0, 1, 1, 0, 0, 0, 2 };

		System.out.println("array before sorting\n");
		System.out.println(Arrays.toString(arr));

		sort(arr);

		System.out.println("-----------------------------------------------");
		System.out.println("\narray after sorting\n");
		System.out.println(Arrays.toString(arr));
	}
}
