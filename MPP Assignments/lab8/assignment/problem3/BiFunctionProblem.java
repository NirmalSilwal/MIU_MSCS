package lab8.assignment.problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionProblem {

	public static void main(String[] args) {

		// yes, the above lambda expression can be expressed as BiFunction interface

		BiFunction<Double, Double, List<Double>> mylistfunc = (x, y) -> {
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(x, y));
			list.add(x * y);
			return list;
		};

		System.out.println(mylistfunc.apply(2.0, 3.0));
	}

}
