package lesson8;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public interface I1 {

	int age = 25;
	
	default void displayAge() {
		System.out.println("I am in I1 interface displayAge() method");
	}
	
	static void displayStaticMethod() {
		System.out.println("I am in I1 interface displayStaticMethod()");
	}
}
