package lesson5;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class ReverseStringPrint {

	public static void reverseStr(String str) {

		if (str == null || str.length() == 0)
			return;

		reverseStr(str.substring(1));

		System.out.println(str.charAt(0));
	}

	public static void main(String[] args) {
		reverseStr("hello");
		System.out.println();
		reverseStr("nirmal");
	}
}
