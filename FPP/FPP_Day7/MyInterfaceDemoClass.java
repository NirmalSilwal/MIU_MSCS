package lesson7;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class MyInterfaceDemoClass implements MyDemoInterface, I2 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("method 1");
	}

	@Override
	public int m2() {
		// TODO Auto-generated method stub
		System.out.println("method 2");
		return 0;
	}

	public static void main(String[] args) {
		MyInterfaceDemoClass obj = new MyInterfaceDemoClass();
		
		obj.m1();
		
		System.out.println(obj.m2());
		
		// access the interface field
		System.out.println(MyDemoInterface.x);
		System.out.println(MyInterfaceDemoClass.x);
		
		// final field cannot be changed
//		MyDemoInterface.x = MyDemoInterface.x + 2; // compiler error
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}
}
