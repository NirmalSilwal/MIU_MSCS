package lesson11.prob1;

public class Key {

	private String firstName;
	private String lastName;

	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return "[" + this.firstName + ", " + this.lastName + "]";
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;

		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj == null)
			return false;

		if (this == obj)
			return true;

		if (this.getClass() != obj.getClass())
			return false;

		Key other = (Key) obj;

		return this.firstName.equals(other.firstName) && 
				this.lastName.equals(other.lastName);

	}

}
