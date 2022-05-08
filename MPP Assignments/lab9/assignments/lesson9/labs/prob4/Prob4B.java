package lab9.assignments.lesson9.labs.prob4;

import java.math.BigInteger;
import java.util.stream.Stream;

public class Prob4B {

	public static void main(String[] args) {
		Prob4B ps = new Prob4B(); 
		ps.printFirstNPrimes(10);
		System.out.println("\n================");
		ps.printFirstNPrimes(5);
	}

	private void printFirstNPrimes(int limit) {
		  Stream.iterate(BigInteger.valueOf(2), BigInteger::nextProbablePrime)
          .limit(limit)
          .forEach(x -> System.out.format("%s ", x));
	}
}
