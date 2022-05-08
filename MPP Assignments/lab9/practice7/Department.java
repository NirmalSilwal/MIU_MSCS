package lab9.practice7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Department {
	
	private String name;
	private List<Person> persons;

	public Department(String name) {
		this.name = name;
		this.persons = new ArrayList<Person>();
	}
	
	public void addPerson(Person p) {
		this.persons.add(p);
	}

	public List<Person> getPersons() {
		return this.persons;
	}

	/*
	 * public void showAllMembers() { for(Person p: persons) {
	 * System.out.print("Name: " + p.getName() + " phone: "+ p.getPhone()+ " age: "+
	 * p.getAge() + " role: "); for(Role pRole: p.getRoles()) {
	 * System.out.print(pRole.getClass().getSimpleName() + " "); }
	 * System.out.println("\n"); } }
	 */
	
	public void showAllMembers() {
		Map<String, List<Role>> memRole = persons.stream()
				.collect(Collectors.toMap((Person p) -> p.toString(), p -> p.getRoles()));
		memRole.forEach((x, y) -> {

			String roles = Optional.ofNullable(y).orElse(new ArrayList<>()).stream()
					.map(r -> r.getClass().getSimpleName()).collect(Collectors.joining(","));
			System.out.print(x.concat("Roles: [").concat(roles).concat("] \n"));

		});
	}

	/*
	 * public void unitsPerFaculty() { for(Person p :persons) { for(Role pRole:
	 * p.getRoles()) { if(pRole instanceof Faculty) { System.out.println("Name: " +
	 * p.getName() + " Units: " + pRole.getUnits() + "\n"); } } } }
	 */

	public void unitsPerFaculty() {
		persons.forEach(d -> d.getRoles().stream().filter(m -> m instanceof Faculty).findAny()
				.ifPresent(m -> System.out.println("Name: " + d.getName() + " Units: " + m.getUnits() + "\n")));
	}

	/*
	 * public double getTotalSalary() { double sumSalary = 0.0; for(Person p:
	 * persons) { for(Role pRole: p.getRoles()) { sumSalary+= pRole.getSalary(); } }
	 * return sumSalary; }
	 */

	public double getTotalSalary() {

		return persons.stream().map(m -> m.getRoles()).flatMap(x -> x.stream()).map(x -> x.getSalary()).reduce(0.0,
				(x, y) -> x + y);

	}

	public void showStudentsByFaculty(String facName) {

		// List<Course> courses =

		persons.stream().filter(p -> p.getName().equals(facName) && p.isFaculty()).findAny()
				.orElseThrow(() -> new RuntimeException(facName + " is Not a Faculty"));
	}

}
