package lesson11;

import java.util.Arrays;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class MyListMain {

	public static void main(String[] args) {
		MyListClass list = new MyListClass();
		list.addLast("nirmal");
		list.addLast("binod");
		System.out.println(list.get(0));
		;
	}
}
