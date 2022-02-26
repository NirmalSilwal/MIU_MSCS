package lesson5;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class FindStringLength {

	public static int findlen(String str) {

		if (str.length() == 0 || str == null)
			return 0;

		int len = 1 + findlen(str.substring(1));

		return len;

	}

	public static void main(String[] args) {
		System.out.println(findlen("nirmal"));
	}
}
