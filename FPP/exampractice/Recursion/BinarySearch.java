package exampractice.Recursion;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class BinarySearch {

	public static int binarySearching(int[] arr, int target) {

		if (arr.length == 0)
			return -1;

		return binarySearchRec(arr, 0, arr.length - 1, target);
	}

	private static int binarySearchRec(int[] arr, int low, int high, int target) {

		if (low > high)
			return -1;

		int mid = low + (high - low) / 2;

		if (arr[mid] == target)
			return mid;

		else if (arr[mid] < target)
			return binarySearchRec(arr, mid + 1, high, target);

		else
			return binarySearchRec(arr, low, mid - 1, target);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 45, 56, 67 };
		for (int n : arr) {
			System.out.println(binarySearching(arr, n));
		}
	}
}
