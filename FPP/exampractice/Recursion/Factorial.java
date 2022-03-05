package exampractice.Recursion;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Factorial {

	public static int fact(int n) {

		if (n == 0 || n == 1)
			return 1;

		return n * fact(n - 1);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(fact(i));
		}
	}
}
