package lesson3;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

final public class Rectangle {

	private final double width;
	private final double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double computeArea() {
		return this.width * this.height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

}
