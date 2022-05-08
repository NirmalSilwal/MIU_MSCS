package lab9.assignments.lesson9.part2.prob9;

import java.util.stream.IntStream;

public class Prob9 {
	static int count = 1;
	
	public static void main(String[] args) {
		printSquares(4);
	}

	public static void printSquares(int num) {
		IntStream intStream = IntStream.iterate(1,n-> calcSquare(++count)).limit(num); 		
		intStream.forEach(i -> System.out.print(i+" "));
	}
	
	public static int calcSquare(int num) {
		return (int)Math.pow(num, 2);
	}
}