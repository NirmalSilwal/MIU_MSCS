package lab3B;

import java.util.ArrayList;

public class Problem3ReverseList {

	/*
	 * running time of this algorithm is O(n) where n is the size of the list, and
	 * O(n) space for recursive call stack in memory
	 */
	public static void reverseList(ArrayList<Integer> list) {
		if (list.size() == 0) {
			return;
		}

		// removing first element from list and putting it in our recursion stack memory
		int removedValue = list.remove(0); // here is is the index in list

		reverseList(list); // recursive call

		/*
		 * accessing removed value from recursion stack memory when base case hits this
		 * way we'll be able to access the list elements in reversed order due to
		 * recursion stack which is made with our recursive calls
		 */

		list.add(removedValue);
	}

	public static void main(String[] args) {
		ArrayList<Integer> testInput = new ArrayList<>();
		testInput.add(1);
		testInput.add(2);
		testInput.add(3);
		testInput.add(40);
		testInput.add(5);
		testInput.add(6);
		testInput.add(7);

		System.out.println("original list: " + testInput);

		reverseList(testInput);

		System.out.println("\nreversed list: " + testInput);
	}
}
