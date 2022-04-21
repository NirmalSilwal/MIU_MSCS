package examPractice.lesson11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SecondSmallestPractice {

	public static Object small(List<?> lst) {
		return helperSmallest(lst);
	}

	// find second smallest
	private static <T> T helperSmallest(List<T> lst) {
		return lst.stream().sorted().skip(lst.size() > 1 ? 1 : 0).findFirst().get();
	}

	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(2, 1, 4, 62, 5, 67);
		System.out.println(small(lst));
		System.out.println(large(lst));

		System.out.println();
		List<String> lst1 = Arrays.asList("a", "d", "w", "c", "b");
		System.out.println(small(lst1));
		System.out.println(large(lst1));

		System.out.println(test1(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)));
	}

	public static Object large(List<?> lst) {
		return helperLarge(lst);
	}

	// find second largest
	private static <T> T helperLarge(List<T> lst) {
		return lst.stream()
				.sorted((Comparator<? super T>) Comparator.reverseOrder())
				.skip(lst.size() > 1 ? 1 : 0)
				.findFirst().get();
//		return lst.stream().sorted().skip(lst.size() > 1 ? lst.size() - 2 : 0).findFirst().get();
	}

	private static int test1(List<Integer> lst) {
		return lst.stream()
				.sorted(Comparator.reverseOrder())
				.skip(lst.size() > 1 ? 1 : 0)
				.findFirst()
				.get();
	}

}
