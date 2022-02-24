package lesson4;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class FieldInitialization {

	// instance fields
	int x;
	float y;
	String str;
	char ch;
	double db;
	boolean bool;

	public static void main(String[] args) {

		FieldInitialization obj = new FieldInitialization();

		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.str);
		System.out.println(obj.ch);
		System.out.println(obj.db);
		System.out.println(obj.bool);
	}
}
