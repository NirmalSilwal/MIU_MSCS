package lesson4;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class MinimumCharacter {

	// approach 1
	public static char findMinChar(String str) {

		// base cases
		if (str == null || str.length() == 0)
			return ' ';

		if (str.length() == 1)
			return str.charAt(0);

		char ch = str.charAt(0); // current character

		// recursive call
		char ans = findMinChar(str.substring(1)); // remaining substring answer

		return ch < ans ? ch : ans; // ternary operation
	}

	/*
	 * approach 2
	 * 
	 * efficient approach without using substring method as substring is costly
	 * operation in String which will effect performance for larger input size
	 * 
	 * we use some virtual index to get the char in current position in the string
	 

	public static char findMinimumCharacter(String str) {
		if (str.length() == 0 || str == null)
			return ' ';
			
		int virtualIndex = 0;
		return findMinCharOptimal(str, virtualIndex, str.length());
	}

	private static char findMinCharOptimal(String str, int virtualIndex, int length) {

		// to be coninuted...
	}
*/
	public static void main(String[] args) {
		System.out.println(findMinChar("akel")); // a
	}
}
