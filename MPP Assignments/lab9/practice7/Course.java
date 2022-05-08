package lab9.practice7;

public class Course {
	µ
	private String id;
	private String title;
	private double units;
	
	public Course(String id, String title, double units){
		this.id = id;
		this.title = title;
		this.units = units;
	}
	
	public double getUnits() {
		return this.units;
	}
	
	public String getTitle() {
		return title;
	}
	public String getId() {
		return id;
	}
	public String toString() {
		return "Course Details- Id:" + this.id + " title: "+ this.title + " units: "+ this.units ;
	}
}
