package lab8.assignment;

import java.util.function.Supplier;

public class Problem1Bii {

	public static void main(String[] args) {
	
		Supplier<Double> val = () -> Math.random();
		
		System.out.println(val.get());
	}

}
