package lab2.prob2A;

public class GradeReport{

	private Student mystudent;
	private String grade;
	
	GradeReport(Student student) {
		this.mystudent = student;
	}

	public Student getMystudent() {
		return mystudent;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return grade;
	}

}
