package lesson4;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class BinarySearchRecursive {

	public static int binarySearch(int[] arr, int target) {

		return binarySearch(arr, target, 0, arr.length - 1);
	}

	private static int binarySearch(int[] arr, int target, int low, int high) {

		if (low > high) // base case
			return -1;

		int mid = low + (high - low) / 2;

		if (arr[mid] == target)
			return mid;

		else if (arr[mid] < target)
			return binarySearch(arr, target, mid + 1, high);

		else
			return binarySearch(arr, target, low, mid - 1);

	}

	public static void main(String[] args) {
		
		int[] arr = { 3, 4, 21, 27, 34, 67, 98, 978, 999 };

		System.out.println(binarySearch(arr, 21));

	}
}
