package lab3.labs.prob1;

public class Person {

	private String name;

	Person(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object aPerson) {
		if (aPerson == null)
			return false;
		if (!(aPerson instanceof Person))
			return false;
		Person p = (Person) aPerson;
		boolean isEqual = this.name.equals(p.name);
		return isEqual;
	}

}
/*
 * Explain why this has happened:
 * 
 * As per the initial implementation provided to us, the equals() method
 * overriden in the Person class was implemented by comparing only the 'name'
 * field whereas in the PersonWithJob class equals() method it compares the
 * 'name 'and 'salary' field which is not consistent comparison so it returns
 * false.
 * 
 * Initially, p1 (PersonWithJon type) equals() method compares name and salary
 * field and since p2 was Person type it didn't have salary field hence it
 * generates false. And p2.equals(p1) returned true because only name field was
 * compared in equals() method in p2 which is Person type.
 */
