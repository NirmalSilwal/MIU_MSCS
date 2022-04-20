package examPractice.lesson9Streams;

public class Person {

	private String name;
	private String dob;

	public Person(String name, String dob) {
		super();
		this.name = name;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + "]";
	}

}
