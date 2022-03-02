package lesson8;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class MyClass implements I1 {

	public static void main(String... args) {

		MyClass obj = new MyClass();
		obj.displayAge();
		
		System.out.println(I1.age);
		I1.displayStaticMethod();
	}
}
