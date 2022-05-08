package lab9.practice7;

import java.util.ArrayList;
import java.util.List;

public class Student extends Role{
	private double gpa;
	private List<Course> courses;
	
	Student(double gpa){
		this.gpa = gpa;
		this.courses = new ArrayList<Course>();
	}
	
	public double getGpa() {
		return gpa;
	}
	public List<Course> getCourses(){
		return this.courses;
	}
	
	public void addCourse(Course course) {
		this.courses.add(course);
	}
	public double getUnits() {
		double totalUnits = 0.0;
		for(Course c: courses) {
			totalUnits+=c.getUnits();
		}
		return totalUnits;
	}
	public double getSalary() {
		return 0.0;
	}

	@Override
	public String toString() {
		return "Student [gpa=" + gpa + ", courses=" + courses + "]";
	}

}
