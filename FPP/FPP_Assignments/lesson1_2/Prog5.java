package lesson1_2;

import java.util.Arrays;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Prog5 {

	public static int[] combine(int[] a, int[] b) {
		
		int[] output = new int[a.length + b.length];
		int curridx = 0;

		for (int item : a) {
			output[curridx] = item;
			curridx++;
		}

		for (int item : b) {
			output[curridx] = item;
			curridx++;
		}

		return output;
	}

	public static void main(String[] args) {
		int[] a = { 5, 6, -4, 3, 1 };
		int[] b = { 3, 8, 9, 11 };

		int[] result = combine(a, b);
		System.out.println("few test cases...\n");
		System.out.println(Arrays.toString(result));

		// more test cases

		int[] a1 = { 1, 35, 22, -8, 0 };
		int[] b1 = { 0, 0, -1, -3, 5, 0 };

		int[] result1 = combine(a1, b1);
		System.out.println(Arrays.toString(result1));
	}
}
