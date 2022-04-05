package lab3.labs.prob1;

public class PersonWithJob {

	private double salary;
	private Person newperson;

	public double getSalary() {
		return salary;
	}

	PersonWithJob(String n, double s) {
		salary = s;
		newperson = new Person(n);
	}

	public String getName() {
		return newperson.getName();
	}

	@Override
	public boolean equals(Object aPersonWithJob) {
		if (aPersonWithJob == null)
			return false;
		if (!(aPersonWithJob instanceof PersonWithJob))
			return false;
		PersonWithJob p = (PersonWithJob) aPersonWithJob;
		boolean isEqual = this.getName().equals(p.getName()) && this.getSalary() == p.getSalary();
		return isEqual;
	}

	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		// As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}

}
