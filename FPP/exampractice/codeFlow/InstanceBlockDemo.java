package exampractice.codeFlow;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class InstanceBlockDemo {

	int n = 10;

	InstanceBlockDemo() {
		System.out.println("default constructor invoked");
	}

	{
		// instance initializer block
		System.out.println("inside instance initializer block");
		System.out.println("I will be called everytime object is made");
	}

	InstanceBlockDemo(int n) {
		System.out.println("inside parameterized constructor");
		this.n = n;
	}
	
	public static void main(String[] args) {
//		InstanceBlockDemo ob = new InstanceBlockDemo();
//		System.out.println();
//		InstanceBlockDemo ob2 = new InstanceBlockDemo();
		
		InstanceBlockDemo ob3 = new InstanceBlockDemo(100);
	}
}
