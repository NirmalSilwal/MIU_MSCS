package lesson5;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Fibonacci {

	public static int fibb(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		return fibb(n - 1) + fibb(n - 2);
	}

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(fibb(i));
		}
	}
}
