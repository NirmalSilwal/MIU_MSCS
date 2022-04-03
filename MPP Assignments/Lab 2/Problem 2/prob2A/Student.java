package lab2.prob2A;

public class Student {

	private String name;
	private GradeReport gradeReport;

	Student(String name) {
		this.name = name;
		gradeReport = new GradeReport(this);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GradeReport getGradeReport() {
		return this.gradeReport;
	}

	@Override
	public String toString() {
		return "report: " + gradeReport;
	}
}
