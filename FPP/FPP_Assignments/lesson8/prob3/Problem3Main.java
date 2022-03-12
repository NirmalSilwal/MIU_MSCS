package lesson8.prob3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Problem3Main {

	public static void main(String[] args) {

		// task 1. create an Arraylist for the class Marketing
		List<Marketing> list = new ArrayList<Marketing>();

		// task 2. adding objects to the Marketing
		list.add(new Marketing("Nirmal", "MacBook Air", 1347.5));
		list.add(new Marketing("Dinesh", "Dell Inspiron", 800.924));
		list.add(new Marketing("Binod", "MabBook Pro", 2600.67));
		list.add(new Marketing("KAnanda", "HP", 720));
		list.add(new Marketing("Ashish", "MabBook Pro", 2550.7));
		// displaying list
		System.out.println("Initial list: \n");
		System.out.println("size of list: " + list.size());
		System.out.println(list);

		// task 3. delete any object from Marketing
		list.remove(1);
		// displaying list
		System.out.println("\nafter removing item:");
		System.out.println("size of list: " + list.size());
		list.forEach(x -> System.out.println(x)); // displays list

		// task 5. sort the list using external class comparator implementation
		Collections.sort(list, new MarketingComparator());

		// approach 2 - sorting using lambda expression

//		Comparator<Marketing> mycomparator = (m1, m2) -> {
//			return Double.compare(m1.getSalesamount(), m2.getSalesamount());
//		};
//		Collections.sort(list, mycomparator);

		System.out.println("\nlist after sorting using salesamout - ");
		list.forEach(x -> System.out.println(x));

		// task 6. sorting using employeename
		// note here one item was removed previously from the original list
		List<Marketing> emp1000 = listMoreThan1000(list);

		Comparator<Marketing> enameComparator = (m1, m2) -> {
			return m1.getEmployeename().compareTo(m2.getEmployeename());
		};

		Collections.sort(emp1000, enameComparator);
		System.out.println("\nlist after sorting using employeename with salesamount > $1000");
		emp1000.forEach(x -> System.out.println(x));

	}

	public static List<Marketing> listMoreThan1000(List<Marketing> list) {

		List<Marketing> mylist = new ArrayList<Marketing>();

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getSalesamount() > 1000) {
				mylist.add(list.get(i));
			}
		}

		return mylist;
	}
}
