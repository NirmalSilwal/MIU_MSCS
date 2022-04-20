package examPractice.lesson9Streams;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Comparator;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {

		List<String> words = new ArrayList<String>(Arrays.asList("java", "c++", "python", "andriod", "ruby", "kotlin"));

		words.stream().filter(w -> w.contains("" + 'a')).forEach(System.out::println);

		// assume list is the list of persons - sorting
		/*
		 * list.stream().sorted(Comparator.comparing(Person::getName).thenComparing(
		 * Person::getDob).reversed()) .forEach(System.out::println);
		 * 
		 * Function<String, Item> cons1 = iname -> new Item(iname);
		 * 
		 * Item myitem = cons1.apply("Apple");
		 * 
		 * myitem.setPrice(1347.5);
		 */

// List<String> to String[] example -

		List<String> strs = Arrays.asList("hello", "java", "how", "are", "you");

// String[] coll = strs.stream().toArray(); // error - Type mismatch: cannot convert from Object[] to String[]

		// String[] coll = (String[]) strs.stream().toArray();

		// System.out.println(coll); // class cast exception

// correct approach
		
		// System.out.println(Arrays.toString(strs.toArray()));
		
		String[] mycoln = strs.stream().toArray(String[]::new);

		System.out.println(Arrays.toString(mycoln));
	}

}
