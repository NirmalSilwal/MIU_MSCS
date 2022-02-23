package lesson1_2;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Prog6 {

	static int min(int[] arrayOfInts) {

		int min = arrayOfInts[0];

		for (int i = 1; i < arrayOfInts.length; i++) {
			if (arrayOfInts[i] < min)
				min = arrayOfInts[i];
		}
		return min;
	}

	public static void main(String[] args) {
		int[] arr = { 2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22 };
		System.out.println(min(arr));
		
		// more test cases
		System.out.println(min(new int[] {13,2,5,3}));
		
		System.out.println(min(new int[] {13,20,5,3,5,3,29,43}));
	}
}
