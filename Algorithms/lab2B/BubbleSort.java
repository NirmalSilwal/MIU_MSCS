package lab2B;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSorting(int[] arr) {

		for (int pass = 1; pass <= arr.length; pass++) {

			for (int j = 0; j < arr.length - pass; j++) {

				if (arr[j] > arr[j + 1]) {

					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 3, 2, 4, 1, 6, 5 };

		bubbleSorting(arr);

		System.out.println(Arrays.toString(arr));
	}
}
