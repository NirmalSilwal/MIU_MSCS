package lesson5.problem1;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Circle extends Shape {

	protected double radius;

	Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	public double calculateArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	public double calculatePerimeter() {
		return 2 * Math.PI * this.radius;
	}
}
