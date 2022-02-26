package lesson5;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class RecursionDemo {

	public static void countDown(int n) {
		// base case
		if (n == 0)
			return;

		System.out.println(n);

		countDown(n - 1);
	}

	public static void main(String[] args) {
		countDown(5);
	}
}
