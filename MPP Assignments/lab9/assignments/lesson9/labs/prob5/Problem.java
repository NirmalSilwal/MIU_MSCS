package lab9.assignments.lesson9.labs.prob5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem {

	// Returns a list of those strings which belong to both of the two input lists
	public static List<String> elementsInBoth(List<String> list1, List<String> list2) {
		// implement
		return list1.stream().
				filter(x -> list2.contains(x)).
				collect(Collectors.toList());
	}

	// Returns a list, in sorted order, of the zipcodes, of those Customers
	// who live in a city whose name contains 6 or more characters,
	// but which does not contain the letter 'e'. Your output list should not
	// contain
	// duplicate elements.
	public static List<String> getZipsOfSpecialCustomers(List<Customer> list) {
		// implement
		return list.stream().
				filter(c -> c.getCity().length() >= 6 && !c.getCity().contains("e")).
				map(Customer::getZip).
				sorted().
				distinct().
				collect(Collectors.toList());
	}

	// test methods
	public static void main(String[] args) {
		testFirstMethod();
		testSecondMethod();
	}

	// expected output: [tree, bike]
	private static void testFirstMethod() {
		List<String> list1 = Arrays.asList(new String[] { "friend", "tree", "bike", "bat" });
		List<String> list2 = Arrays.asList(new String[] { "tree", "strong", "bike", "weak" });
		System.out.println("Strings occurring in both lists: " + elementsInBoth(list1, list2));
	}

	// expected output: [54672, 57532]
	private static void testSecondMethod() {
		Customer cust1 = new Customer("Bob", "11 Adams", "Fairfield", "52556");
		Customer cust2 = new Customer("Laurence Lebihans", "12, rue des Bouchers", "Marseille", "13008");
		Customer cust3 = new Customer("Andy", "1000 Channing Ave", "Oskaloosa", "54672");
		Customer cust4 = new Customer("Zeke", "212 Wilkshire Blvd", "Chicago", "57532");
		Customer cust5 = new Customer("Blauer Delikatessen", "Forsterstr. 57", "Mannheim", "68306");
		Customer cust6 = new Customer("Anna", "10 Adams", "Fairfield", "52556");
		Customer cust7 = new Customer("Tom", "211 Blake Ave", "Oskaloosa", "54672");
		List<Customer> list = Arrays.asList(cust1, cust2, cust3, cust4, cust5, cust6, cust7);
		System.out.println("Zipcodes of Customers whose city name has length >= 6 but does not contain the letter 'e': "
				+ getZipsOfSpecialCustomers(list));
	}
}
