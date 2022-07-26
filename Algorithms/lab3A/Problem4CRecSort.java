package lab3A;

import java.util.ArrayList;

public class Problem4CRecSort {

	public static ArrayList<Integer> recSort(ArrayList<Integer> list) {
		int mid = list.size() / 2;

		if (list.size() > 1) {

			ArrayList<Integer> list1 = new ArrayList<>();
			ArrayList<Integer> list2 = new ArrayList<>();

			partition(list, list1, list2, mid);

			list1 = recSort(list1);
			list2 = recSort(list2);

			list = merge(list, list1, list2);
		}

		return list;
	}

	private static ArrayList<Integer> merge(ArrayList<Integer> list, ArrayList<Integer> list1,
			ArrayList<Integer> list2) {
		if (list1.size() == 0)
			return list2;
		if (list2.size() == 0)
			return list1;

		int ptr1 = 0, ptr2 = 0, pos = 0;

		while (ptr1 < list1.size() && ptr2 < list2.size()) {
			if (list1.get(ptr1) < list2.get(ptr2)) {
				list.set(pos++, list1.get(ptr1++));
			} else {
				list.set(pos++, list2.get(ptr2++));
			}
		}

		while (ptr1 < list1.size()) {
			list.set(pos++, list1.get(ptr1++));
		}

		while (ptr2 < list2.size()) {
			list.set(pos++, list2.get(ptr2++));
		}

		return list;
	}

	private static void partition(ArrayList<Integer> list, ArrayList<Integer> list1, ArrayList<Integer> list2,
			int mid) {

		for (int i = 0; i < mid; i++) {
			list1.add(list.get(i));
		}

		for (int i = mid; i < list.size(); i++) {
			list2.add(list.get(i));
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> testInput = new ArrayList<>();
		testInput.add(6);
		testInput.add(2);
		testInput.add(1);
		testInput.add(4);
		testInput.add(0);
		testInput.add(13);
		testInput.add(23);
		testInput.add(13);

		System.out.println("before sorting: " + testInput);
		System.out.println("\nafter sorting: " + recSort(testInput));
	}
}
