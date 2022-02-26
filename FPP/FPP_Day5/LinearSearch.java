package lesson5;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class LinearSearch {

	public static int search(int[] arr, int target) {
		return linearsearch(arr, 0, target);
	}

	// utility method

	// linear search using recursion	
	private static int linearsearch(int[] arr, int id, int target) {

		if (id == arr.length)
			return -1;

		if (arr[id] == target)
			return id;

		return linearsearch(arr, id + 1, target);
	}

	public static void main(String[] args) {
		int[] arr = { 12, 15, 23, 55, 5, 6 };
		System.out.println(search(arr, 23));
		System.out.println(search(arr, 33));
		System.out.println(search(arr, 6));

	}
}
