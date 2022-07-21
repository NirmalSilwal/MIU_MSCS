package lab1B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem6 {

	public static List<Set> powerSet(List list) {

		// implement
		List<Set> result = new ArrayList<>();

		findAllSubsets(list, 0, new ArrayList<Integer>(), result);
		return result;
	}

	// solving recursively
	private static void findAllSubsets(List<Integer> list, int index, List<Integer> temp, List<Set> result) {

		if (index >= list.size()) {
			result.add(new HashSet<Integer>(temp));
			return;
		}

		temp.add(list.get(index)); // take
		findAllSubsets(list, index + 1, temp, result);

		temp.remove(temp.size() - 1); // do not take current index element
		findAllSubsets(list, index + 1, temp, result);
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2));
		System.out.println(powerSet(list));

		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1));
		System.out.println(powerSet(list2));

		List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		System.out.println(powerSet(list3));
	}
}
