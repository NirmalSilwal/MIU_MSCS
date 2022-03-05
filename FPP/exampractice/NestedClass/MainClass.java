package exampractice.NestedClass;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class MainClass {

	public static void main(String[] args) {
		
		OuterClass outer = new OuterClass();

		outer.printAge();
		
//		InnerClass inner = new InnerClass(); // error
		
		OuterClass.InnerClass inner = (new OuterClass()).new InnerClass();  
		
		inner.heyThere();
		
		OuterClass.InnerStaticClass innerstatic = new OuterClass.InnerStaticClass();
		
		innerstatic.whatsup();
	}

}
