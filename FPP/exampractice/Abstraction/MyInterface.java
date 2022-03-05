package exampractice.Abstraction;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public interface MyInterface {

	void sing();

	default void move() {
		System.out.println("moving in my interface");
	}

	public static void laugh() {
		System.out.println("happy person in my interface");
	}
}
