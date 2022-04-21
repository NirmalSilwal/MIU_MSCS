package examPractice.lesson11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindMaxGeneric {

	public static Integer max0(List<Integer> list) {
		Integer max = list.get(0);
		for (Integer i : list) {
			if (i.compareTo(max) > 0) {
				max = i;
			}
		}
		return max;
	}

	public static <T> T max2(List<T> list, Comparator<T> cmp) {
		T theMax = list.get(0);
		for (T item : list) {
			if (cmp.compare(item, theMax) > 0) {
				theMax = item;
			}
		}
		return theMax;
	}

	// practice methods
	public static <T extends Comparable<T>> T maxx1(List<T> lst) {
		T ans = lst.get(0);
		for (T value : lst) {
			if (value.compareTo(ans) > 0)
				ans = value;
		}
		return ans;
	}

	public static <T> T maxx4(List<? extends T> lst, Comparator<? super T> comp) {
		T ans = lst.get(0);
		for (T value : lst) {
			if (comp.compare(value, ans) > 0)
				ans = value;
		}
		return ans;
	}

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(3);
		ints.add(4);
		ints.add(-1);
		System.out.println(max0(ints));

		List<String> strs = new ArrayList<>();
		strs.add("Bob");
		strs.add("Steve");
		strs.add("Tom");
		System.out.println(maxx1(ints));
		System.out.println(maxx1(strs));

		// To find the "max Employee", we need to specify a Comparator
		// since Employee does not implement Comparable

//		List<Employee> emps = new ArrayList<>();
//		emps.add(new Employee("Bob", 50000));
//		emps.add(new Employee("Steve",60000));
//		emps.add(new Employee("Harold",70000));
//		System.out.println(
//		   max2(emps, Comparator.comparing(Employee::getSalary)
//				                            .thenComparing(Employee::getName)));
	}

}
