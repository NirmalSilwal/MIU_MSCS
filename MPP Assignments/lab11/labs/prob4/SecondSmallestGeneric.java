package lab11.labs.prob4;

import java.util.List;

public class SecondSmallestGeneric {

	public static Object secondSmallest(List<?> lists) {
		return helperSmallest(lists);
	}

	private static <T> T helperSmallest(List<T> list) {
		return list.stream().sorted().skip(list.size() > 1 ? 1 : 0).findFirst().get();
	}

	public static void main(String[] args) {
		List<Integer> lst1 = List.of(0, 10, 23, 345, 5646453, 34, 234);
		List<String> str = List.of("a", "t", "x", "w", "d");

		System.out.println(secondSmallest(lst1));
		System.out.println(secondSmallest(str));
	}

// traditional way to find second smallest
	/*
	 * public static int secondSmallest1(int[] lists) {
	 * 
	 * int first = 0, second = 0;
	 * 
	 * if (lists[0] > lists[1]) { first = lists[1]; second = lists[0]; } else {
	 * first = lists[0]; second = lists[1]; }
	 * 
	 * for (int i = 3; i < lists.length; i++) { int current = lists[i]; if (current
	 * < second) { if (current < first) { second = first; first = current; } else {
	 * second = current; } } else if (current > first && current < second) { second
	 * = current; } }
	 * 
	 * // System.out.println(first + " " + second);
	 * 
	 * return second;
	 * 
	 * }
	 */
}
