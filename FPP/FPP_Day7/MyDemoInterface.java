package lesson7;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public interface MyDemoInterface {

	/*
	 * all interface methods are unimplemented pre-java 8
	 * 
	 * by default methods are public and abstract
	 */

	public abstract void m1();

	int m2(); // considered as public abstract by default in terms of pre-java 8

	// interface can have fields, public static final - you cannot modify

	int x = 10; // by default it is public static final
}
