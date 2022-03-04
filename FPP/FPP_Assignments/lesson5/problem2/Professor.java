package lesson5.problem2;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Professor extends DeptEmployee {

	private int numberOfPublications;

	Professor(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		this.numberOfPublications = 0;
	}

	public int getNumberOfPublications() {
		return this.numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

}
