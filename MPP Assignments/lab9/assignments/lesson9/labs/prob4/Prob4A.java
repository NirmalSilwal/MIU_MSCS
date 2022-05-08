package lab9.assignments.lesson9.labs.prob4;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Prob4A {

	public static void main(String[] args) {
		
		final Stream<Integer> primes = Stream.iterate(2, n -> primeNumbers(n++) ? n : null); 
		System.out.println(primes.limit(2).collect(Collectors.toList()));	
	}
	
	public static boolean primeNumbers(int n) {
		return IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(i -> n % i == 0);
	}
}
