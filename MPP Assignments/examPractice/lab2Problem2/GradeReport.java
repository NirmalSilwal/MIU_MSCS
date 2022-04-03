package examPractice.lab2Problem2;

public class GradeReport {

	private String grade;
	private Student student;

	GradeReport(Student student) {
		this.student = student;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "grade: " + grade;
	}
}
