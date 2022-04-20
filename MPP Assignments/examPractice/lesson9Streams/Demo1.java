package examPractice.lesson9Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {

		List<Integer> lists = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		// even number
		lists.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

		System.out.println("---");

		// odd number
		lists.stream().filter(n -> n % 2 != 0).forEach(System.out::println);

		List<String> list1 = new ArrayList<>(
				Arrays.asList("Java", "Andriod", "Kotlin", "Ruby", "Angular", "Python", "R", "Javascript"));

		System.out.println("---");

		// filter name what starts with 'J'
		list1.stream().filter(n -> n.startsWith("J")).forEach(System.out::println);

		System.out.println("---");

		// filter the name having length > 5
		List<String> names = list1.stream().filter(n -> n.length() > 6).collect(Collectors.toList());

		System.out.println(names);
		
		
	}

}
