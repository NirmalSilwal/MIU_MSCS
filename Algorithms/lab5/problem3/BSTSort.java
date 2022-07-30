package lab5.problem3;

import java.util.List;

import Sorting.runtime.Sorter;

public class BSTSort extends Sorter {

	@Override
	public int[] sort(int[] arr) {

		MyBST tree = new MyBST();
		for (int i = 0; i < arr.length - 1; i++) {
			tree.insert(arr[i]);
		}
		List<Integer> res1 = tree.toArray(); // from MyBST class

		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = res1.get(i);
		}
		return arr;
	}

}
