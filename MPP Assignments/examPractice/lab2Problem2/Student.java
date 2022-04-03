package examPractice.lab2Problem2;

public class Student {

	private String name;
	private GradeReport gradereport;

	public Student(String name) {
		this.name = name;
		gradereport = new GradeReport(this); // passing current student reference to gradereport class
	}

	public String getName() {
		return name;
	}

	public GradeReport getGradeReport() {
		return gradereport;
	}

	@Override
	public String toString() {
		return "name: " + name + " gradereport :" + gradereport;
	}
}
