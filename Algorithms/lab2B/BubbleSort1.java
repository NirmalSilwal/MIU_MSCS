package lab2B;

import java.util.Arrays;

public class BubbleSort1 {

	public static void bubbleSort1(int[] arr) {
		for (int i = 0; i < arr.length; i++) {

			boolean flag = false;

			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					flag = true;
					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

			if (!flag) {
				return;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };

		bubbleSort1(arr);

		System.out.println(Arrays.toString(arr));
	}
}
