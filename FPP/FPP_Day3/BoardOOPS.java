package lesson3;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class BoardOOPS {

	/*
	 * class is a template / blueprint
	 * 
	 * it consists of data members -> instance fields
	 * 
	 * Behaviors / method / service / instance methods
	 * 
	 * main class - declare a class with either public or default (no modifier)
	 * 
	 * public means visible in all places
	 * 
	 * data members - for security reason - always declare them as private
	 */

	// data members / instance fields / properties
	private double height;
	private double weight;
	private String color;

	// Constructor - to initialize the data members properties
	// constructor does not have return type

	// default constructor
	public BoardOOPS() {
		
//		this(); // cannot call constructor itself
		
		this.height = 45.6;
		this.weight = 40;
		this.color = "white";
	}

	// parameterized constructor
	BoardOOPS(double ht, double weight) {
		height = ht;
		// this keyword helps to call current object fields, methods, constructor
		this.weight = weight;
	}

	BoardOOPS(double height, double weight, String color) {
		this.height = height;
		this.weight = weight;
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

	/*
	 * you can call another constructor using this and it must be the first line of
	 * code in that method
	 */
	
	// right click - source - generate getters and setters
	
	
}
