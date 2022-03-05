package exampractice.Recursion;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class StringLength {

	public static int findStringLength(String str) {

		if (str == null || str.length() == 0)
			return 0;

		return 1 + findStringLength(str.substring(1));
	}

	public static void main(String[] args) {
		System.out.println(findStringLength("nirmal"));
	}
}
