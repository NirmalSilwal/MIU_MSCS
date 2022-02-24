package lesson4;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class StaticDemo {

//	 int objcount = 0; // test without using static keyword
	static int objcount = 0;

	StaticDemo() {
		objcount++;
	}

	public int getTotalObjects() {
		return this.objcount;
	}

	// static fields cannot access non static fields
	// all static fields are initialized once the class is loaded
	// you can not use this keyword for static fields
}
