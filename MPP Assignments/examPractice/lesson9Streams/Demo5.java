package examPractice.lesson9Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo5 {

	public static void main(String[] args) {

		List<List<String>> list = Arrays.asList(Arrays.asList("hello", "world"), Arrays.asList("MIU", "MPP"),
				Arrays.asList("FPP", "Renuka mam"));

		System.out.println(list);

		List<String> flatList = list.stream().flatMap(Collection::stream) // .flatMap(x -> x.stream())
				.collect(Collectors.toList());

		System.out.println(flatList);

		// stateful transformation

		System.out.println("\nexample 1 ---\n");

		Stream<String> uniquewords = Stream.of("hello", "world", "hello", "java", "MIU", "java", "hello", "MIU")
				.distinct();

		uniquewords.forEach(System.out::println);

		System.out.println("\nexample 2 ---\n");

		Stream<String> sortlist = Stream.of("maharishi", "java", "MPP", "Ankhutya", "Spring")
				.sorted((x, y) -> x.length() - y.length());

		sortlist.forEach(System.out::println);

		System.out.println("\nsorting result---\n");

		List<String> lstcheck = Arrays.asList("12345678","1234","123456","123");

		lstcheck.stream().sorted().forEach(System.out::println);

		System.out.println("\n------");

		// using method reference
		List<String> lst2 = Arrays.asList("Hello", "MPP", "javaCode", "Nirmal");

		lst2.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);

		System.out.println();

		// using lambda
		List<String> listcopy = Arrays.asList("Hello", "MPP", "javaCode", "Nirmal");

		listcopy.stream().sorted(Comparator.comparing(x -> x.toString().length()).reversed())
				.forEach(System.out::println);
	}

}
