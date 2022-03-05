package exampractice.NestedClass;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class OuterClass {

	private int age = 10;
	
	public void printAge() {
		System.out.println("inside outer class print age method -> " + this.age);
		
		// method local inner class
		class LocalInnerClass {
			int localinnervariable = 999;
			
			public void localinnermethod() {
				System.out.println("inside local inner method -> " + localinnervariable);
			}
		}
		
		LocalInnerClass localinner = new LocalInnerClass();
		localinner.localinnermethod();
		System.out.println(localinner.localinnervariable);;
	}
	
	// non-static inner class
	public class InnerClass {
		int innerNumber = 9;
		
		public void heyThere() {
			System.out.println("inside non-static inner class");
		}
	}
	
	// static inner class
	public static class InnerStaticClass {
			int innerNumber = 9;
			
			public void whatsup() {
				System.out.println("inside static inner class");
			}
		}
	
	
}
