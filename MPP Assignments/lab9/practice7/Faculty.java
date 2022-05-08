package lab9.practice7;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Role {

	private double salary;
	private List<Course> courses;
	
	public Faculty(double salary){
		this.salary = salary;
		this.courses = new ArrayList<Course>();
	}
	public double getSalary() {
		return salary;
	}
	
	public double getUnits() {
		double totalUnits = 0.0;
		for(Course c:courses) {
			totalUnits+=c.getUnits();
		}
		return totalUnits;
	}
	public List<Course> getCourses(){
		return this.courses;
	}
	public void addCourse(Course course) {
		courses.add(course);
	}
	@Override
	public String toString() {
		return "Faculty [salary=" + salary + ", courses=" + courses + "]";
	}
	
}
