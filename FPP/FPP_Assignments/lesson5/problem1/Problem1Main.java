package lesson5.problem1;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Problem1Main {

	public static void main(String... args) {

		Shape[] shapes = { new Rectangle("red", 2, 4), new Circle("white", 2.5), new Square("black", 4),
				new Rectangle("green", 3, 5), new Circle("yellow", 5) };

		printTotal(shapes);
	}

	public static void printTotal(Shape[] shapes) {

		for (Shape currentShape : shapes) {

			double area = currentShape.calculateArea();
			double perimeter = currentShape.calculatePerimeter();

			System.out.println(
					currentShape.getClass().getSimpleName() + " : " + "area " + area + ", perimeter " + perimeter);
			System.out.println();
		}
	}
}
