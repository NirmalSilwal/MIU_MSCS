package lesson11.prob1;

import java.util.*;

public class Test {

	public static void main(String[] args) {

		@SuppressWarnings("serial")
		List<Student> list = new ArrayList<Student>() {
			{
				add(new Student("Joe", "Smith", 3.2, Standing.FRESHMAN));
				add(new Student("Tom", "Rogers", 3.5, Standing.SENIOR));
				add(new Student("HeLing", "Wu", 2.9, Standing.JUNIOR));
				add(new Student("Pierre", "Fromage", 2.8, Standing.FRESHMAN));
				add(new Student("Ihaku", "Tamataku", 3.9, Standing.JUNIOR));
				add(new Student("Richard", "Wong", 2.8, Standing.SOPHOMORE));
			}
		};

		HashMap<Key, Student> map = Admin.processStudents(list);

		boolean[] expectedOutput = { true, false };
		boolean[] results = new boolean[2];

		Student s = new Student("Pierre", "Fromage", 2.8, Standing.FRESHMAN);
		Key pierre = new Key("Pierre", "Fromage");
		Key richard = new Key("Richard", "Fremling");
 
		
		results[0] = (map.get(pierre).equals(s));
		results[1] = map.containsKey(richard);

		System.out.println((Arrays.equals(expectedOutput, results) ? "pass" : "fail"));
//
		double ave = Admin.computeAverageGPA(map);
		// Expected output : Average GPA : 3.1833333333333336
		System.out.println("Average GPA : " + ave);

	}

}
