package exampractice.Recursion;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class VowelCount {

	public static int vowelCounting(String str) {

		if (str == null)
			return 0;

		if (str.length() == 0)
			return 0;

		char ch = str.charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return 1 + vowelCounting(str.substring(1));
		} else
			return vowelCounting(str.substring(1));
	}

	public static void main(String[] args) {
		System.out.println(vowelCounting("aeiouasd"));
	}
}
