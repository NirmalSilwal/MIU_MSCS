package lesson11.prob1;

import java.util.*;
import java.util.Map.Entry;

public class Admin {

	public static HashMap<Key, Student> processStudents(List<Student> students) {
		// implement
		HashMap<Key, Student> map = new HashMap<>();

		for (Student mystudent : students) {

			Key currentkey = new Key(mystudent.getFirstName(), mystudent.getLastName());

			map.put(currentkey, mystudent);
		}

		return map;
	}

	public static double computeAverageGPA(HashMap<Key, Student> maps) {
		// implements
		double total = 0;

		for (Entry<Key, Student> myentry : maps.entrySet()) {
			total += myentry.getValue().getGpa();
		}

		double average = total / maps.size();

		return average;
	}
}
