package lab1A;

import java.util.ArrayList;
import java.util.LinkedList;

// Sorting algorithm

public class Problem4 {

	// Part A

	// using brute force approach - O(N^2) time, O(1) space

	public static void sort(ArrayList<Integer> list) {
		// implement

		for (int pass = 0; pass < list.size() - 1; pass++) {

			for (int cursor = 0; cursor < list.size() - pass - 1; cursor++) {

				if (list.get(cursor) > list.get(cursor + 1)) {
					// swap
					int temp = list.get(cursor);
					list.set(cursor, list.get(cursor + 1));
					list.set(cursor + 1, temp);
				}
			}
		}
	}

	// Part B

	// brute force solution
	public static void sort(LinkedList<Integer> list) {
		// implement
		for (int pass = 0; pass < list.size() - 1; pass++) {

			for (int cursor = 0; cursor < list.size() - pass - 1; cursor++) {

				if (list.get(cursor) > list.get(cursor + 1)) {
					// swap
					int temp = list.get(cursor);
					list.set(cursor, list.get(cursor + 1));
					list.set(cursor + 1, temp);
				}
			}
		}
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(9);
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(0);

		System.out.println("ArrayList before sorting\n");
		System.out.println(list);
		sort(list);
		System.out.println("\nArrayList after sorting\n");
		System.out.println(list);

		System.out.println("----------------------------------");

		LinkedList<Integer> linkedlists = new LinkedList<>();
		linkedlists.add(2);
		linkedlists.add(9);
		linkedlists.add(1);
		linkedlists.add(5);
		linkedlists.add(3);
		linkedlists.add(0);

		System.out.println("LinkedList before sorting\n");
		System.out.println(linkedlists);
		sort(linkedlists);
		System.out.println("\nLinkedList after sorting\n");
		System.out.println(linkedlists);

	}
}
