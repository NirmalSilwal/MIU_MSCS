package lab7.lessson7.labs.prob3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {
	int val = 0;

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation",
				"Everywhere you want to be");

		// print each element of the list in upper case format
		ForEachExample obj = new ForEachExample();
		obj.process(list);
	}

	public void process(List<String> list) {
		MyConsumer con = new MyConsumer();
		list.forEach(con);
	}

	// implement a Consumer
	class MyConsumer implements Consumer<String> {
		public void accept(String mystr) {
			System.out.println(mystr.toUpperCase());
		}
	}

}