package lab11.labs.prob2;

import java.util.*;

public class GroupUtil {

	// Fix this code

// given code
	/*
	 * public static Group<?> copy(Group<?> group) { List<?> elements =
	 * group.getElements(); Group<?> grp = new Group<?>(group.getSpecialElement(),
	 * elements); return grp; }
	 */

	// after fixing

	public static Group<?> copy(Group<?> group) {
		return copyHelper(group);
	}

	public static <T> Group<T> copyHelper(Group<T> group) {

		List<T> elements = group.getElements();

		Group<T> grp = new Group<T>(group.getSpecialElement(), elements);

		return grp;
	}

	// Test using this main method
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(0, 1, 2, 3, 4);

		Group<Integer> group = new Group<>(0, list);

		System.out.println(group);

		System.out.println();

		System.out.println(GroupUtil.copy(group));
	}
}
