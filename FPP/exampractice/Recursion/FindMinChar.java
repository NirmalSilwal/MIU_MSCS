package exampractice.Recursion;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class FindMinChar {

	public static char findMinChar(String str) {
		if (str.length() == 0)
			return ' ';
		if (str.length() == 1)
			return str.charAt(0);

		char ch = str.charAt(0);
		char remaining = findMinChar(str.substring(1));

		return ch < remaining ? ch : remaining;
	}

	public static void main(String[] args) {
		System.out.println(findMinChar("kjgfsab"));
	}
}
