package lesson5.problem1;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Rectangle extends Shape {

	protected double width;
	protected double height;

	Rectangle(String color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public double calculateArea() {
		return this.width * this.height;
	}

	public double calculatePerimeter() {
		return 2 * this.width + 2 * this.height;
	}
}
