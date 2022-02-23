package lesson1_2;

import java.util.Arrays;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Prog3 {

	public static String[] removeDups(String[] arr) {

		String[] unique = new String[arr.length];
		int outputidx = 0;

		for (int i = 0; i < arr.length; i++) {

			String currentword = arr[i];

			// checking if another currword exists in arr

			boolean hasDuplicates = false; // for duplicates

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].equals(currentword)) { // if duplicate exists
					hasDuplicates = true;
					break;
				}
			}

			// storing unique element in unique array only if duplicate was not found
			if (hasDuplicates == false) {
				unique[outputidx] = currentword;
				outputidx++;
			}
		}

		// unique contains unique elements as well as null so removing null
		String[] finalOutput = new String[outputidx];
		for (int i = 0; i < outputidx; i++) {
			finalOutput[i] = unique[i];
		}

		return finalOutput;
	}

	public static void main(String[] args) {

		String[] arr = { "horse", "dog", "cat", "horse", "dog" };
//		String[] arr = {"elephant","zebra","zebra","horse","elephant","dog","cat","cat" };

		System.out.println("original array: ");
		System.out.println(Arrays.toString(arr));

		String[] unique = removeDups(arr);

		System.out.println("\nafter removing duplicates: ");
		System.out.println(Arrays.toString(unique));

		// note here original array is not modified
	}
}
