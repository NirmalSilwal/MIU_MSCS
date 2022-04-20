package examPractice.lesson9Streams;

import java.util.Random;
import java.util.stream.Stream;

public class Demo3 {

	public static void main(String[] args) {

		// 2 ways to generate infinite streams - generate and iterate

		Stream<String> echoes = Stream.generate(() -> "Echo");

		// echoes.forEach(System.out::println); // this gives infinite Echo in console

		echoes.limit(10).forEach(System.out::println);

//		Stream<Double> randoms = Stream.generate(Math::random); 

		// using method reference
		Stream<Double> randoms = Stream.generate(Math::random);

		randoms.limit(10).forEach(System.out::println);

		// using lambdas
		Stream<Integer> randNumInfinite = Stream.generate(() -> new Random().nextInt());

		System.out.println();
		randNumInfinite.limit(5).forEach(System.out::println);

		// using iterate

		Stream<Integer> naturalNum = Stream.iterate(1, n -> n + 1);

//		naturalNum.forEach(System.out::println); // gives infinite natural numbers

		naturalNum.limit(10).forEach(System.out::println);

		// to join two streams
		System.out.println();

		Stream<Character> s1 = Stream.of('h', 'e', 'l', 'l', 'o');
		Stream<Character> s2 = Stream.of('M', 'I', 'U');

		Stream<Character> combined = Stream.concat(s1, s2);

//		combined.forEach(System.out::print);
		combined.forEach(x -> System.out.print(x + " "));
	}

}
