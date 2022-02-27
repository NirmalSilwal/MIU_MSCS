package lesson3;

import java.util.Scanner;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Problem3Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter C for Circle");
		System.out.println("Enter R for Rectangle");
		System.out.println("Enter T for Triangle");

		char userinput = sc.next().charAt(0);

		switch (userinput) {

		case 'R': {
			System.out.println("Enter width of rectangle: ");
			double width = sc.nextDouble();

			System.out.println("Enter height of rectangle");
			double height = sc.nextDouble();

			Rectangle rectangle = new Rectangle(width, height);

			double area = rectangle.computeArea();

			System.out.println("The area of Rectangle is: " + area);

			break;
		}

		case 'T': {
			System.out.println("Enter base of triangle: ");
			double base = sc.nextDouble();

			System.out.println("Enter height of triangle");
			double height = sc.nextDouble();

			Triangle triangle = new Triangle(base, height);

			double area = triangle.computeArea();

			System.out.println("The area of Rectangle is: " + area);

			break;
		}

		case 'C': {
			System.out.println("Enter the radius of circle: ");
			double radius = sc.nextDouble();

			Circle circle = new Circle(radius);

			double area = circle.computeArea();

			System.out.println("The area of Rectangle is: " + area);

			break;
		}

		default:
			System.out.println("Invalid input!");
		}

		sc.close();
	}

}
