package lab9.practice7;

public class Staff  extends Role{

	private double salary;
	
	Staff(double salary){
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	public double getUnits() {
		return 0.0;
	}
	@Override
	public String toString() {
		return "Staff [salary=" + salary + "]";
	}
	
}
