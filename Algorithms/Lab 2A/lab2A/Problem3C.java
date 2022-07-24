package lab2A;

import java.util.Arrays;

// merge two sorted array

public class Problem3C {

	public static int[] merge(int[] arr1, int[] arr2) {

		if (arr1.length == 0)
			return arr2;
		if (arr2.length == 0)
			return arr1;

		int[] mergedArray = new int[arr1.length + arr2.length]; // to store result
		int currentIndex = 0; // keeps track of index position in result array

		// taking two pointers to track position in given two sorted arrays
		int ptr1 = 0, ptr2 = 0;

		while (ptr1 < arr1.length && ptr2 < arr2.length) {

			if (arr1[ptr1] < arr2[ptr2]) {
				mergedArray[currentIndex++] = arr1[ptr1++];
			} else {
				mergedArray[currentIndex++] = arr2[ptr2++];
			}
		}

		// now dealing with remaining elements in one of the array if size of two input
		// array are different

		while (ptr1 < arr1.length) {
			mergedArray[currentIndex++] = arr1[ptr1++];
		}

		while (ptr2 < arr2.length) {
			mergedArray[currentIndex++] = arr2[ptr2++];
		}

		return mergedArray;
	}

	public static void main(String[] args) {

		int[] arr1 = { 1, 4, 5, 8, 17 };
		int[] arr2 = { 2, 4, 8, 11, 13, 21, 23, 25 };

		int[] mergedArray = merge(arr1, arr2);

		System.out.println(Arrays.toString(mergedArray)); // [1, 2, 4, 4, 5, 8, 8, 11, 13, 17, 21, 23, 25]
	}

}
