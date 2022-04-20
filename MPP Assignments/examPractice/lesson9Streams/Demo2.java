package examPractice.lesson9Streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {

		// creating own stream

		Integer[] arr = { 1, 2, 3, 5, 7, 89, 53 };

		Stream<Integer> mystream = Stream.of(arr);

//		System.out.println("count: " + mystream.count()); // once it is consumed it cannot be used again so comment this line to run below line or else it gives exception
		mystream.forEach(System.out::println);

		System.out.println();
		// with primitive type
		int[] arr1 = { 1, 2, 3, 5, 7, 89, 53 };

		Stream<int[]> mystream1 = Stream.of(arr1);

		// System.out.println(mystream1);
		System.out.println("count: " + mystream1.count());

		// recommended way
		IntStream coll = IntStream.of(arr1);
		System.out.println("count: " + coll.count());

		IntStream list5 = IntStream.of(1, 2, 4, 5, 6);
		System.out.println("count: " + list5.count());
	}

}
