package lesson4;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class TestStaticDemo {

	public static void main(String[] args) {

		// to count total objects made for that class StaticDemo
		StaticDemo demo = new StaticDemo();
		StaticDemo obj1 = new StaticDemo();

		System.out.println(obj1.getTotalObjects());

		StaticDemo obj2 = new StaticDemo();
		StaticDemo obj3 = new StaticDemo();
		StaticDemo obj4 = new StaticDemo();

		System.out.println(obj1.getTotalObjects());

	}

}
