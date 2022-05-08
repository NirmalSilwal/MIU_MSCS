package lab9.assignments.lesson9.part2.prob11b;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class LambdaLibrary {
	
	 public static final Function<List<Employee>, String> EMPLOYEES_MORE_THAN_100K_AND_AFTER_M 
	  		= (list) -> Arrays.toString(	
	  					list.stream()
						.filter(e -> e.getSalary() > 100000 && e.getLastName().matches("^[n-zN-Z].*$"))
						.map(e -> e.getFirstName() + " " + e.getLastName())
						.sorted().toArray())
	  		.replace("[", "").replace("]", "");
}