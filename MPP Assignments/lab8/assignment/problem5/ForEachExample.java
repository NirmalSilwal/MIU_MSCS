package lab8.assignment.problem5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {
	int val = 0;

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation",
				"Everywhere you want to be");

		// print each element of the list in upper case format

		// a. Use a lambda expression instead of directly defining a Consumer
		list.forEach(word -> {
			System.out.println(word.toUpperCase());
		});

		// b. Use a method reference in place of your lambda expression in (a)
		System.out.println("\n---------------\n");
		MyConsumer con = new MyConsumer();
		
		list.forEach(con::accept);
	}

	// implement a Consumer
	static class MyConsumer implements Consumer<String> {
		public void accept(String mystr) {
			System.out.println(mystr.toUpperCase());
		}
	}

}