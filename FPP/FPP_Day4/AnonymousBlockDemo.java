package lesson4;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class AnonymousBlockDemo {

	static {
		System.out.println("I am 1st STATIC BLOCK");
	}

	public AnonymousBlockDemo() {
		System.out.println("I am default constructor.");
	}

	{
		System.out.println("i am ANONYMOUS BLOCK 1 and gets invoked before constructor call");
	}

	public AnonymousBlockDemo(int age) {
		System.out.println("I am parameterized constructor with age " + age);
	}

	{
		System.out.println("i am ANONYMOUS BLOCK 2 and gets invoked before constructor call");
	}

	static {
		System.out.println("I am 2nd STATIC BLOCK");
	}

	public static void main(String[] args) {

		// making object of the class, this will first invovke the anonymous block and
		// then default constructor will be called
		AnonymousBlockDemo defaultInvokation = new AnonymousBlockDemo();

		AnonymousBlockDemo paramInvokation = new AnonymousBlockDemo(26);

		// every time there is constructor call, first anonymous blocks gets invoked and
		// then only that constructor
	}
}
