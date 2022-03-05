package exampractice.Recursion;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class LinearSearch {

	public static int linearsearch(int[] arr, int target) {
		if (arr.length == 0)
			return -1;
		return linearRecursive(arr, target, 0);
	}

	private static int linearRecursive(int[] arr, int target, int index) {
		if (index == arr.length)
			return -1;

		if (arr[index] == target)
			return index;

		return linearRecursive(arr, target, index + 1);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 45, 56, 67 };
		for (int n : arr) {
			System.out.println(linearsearch(arr, n));
		}
	}
}
