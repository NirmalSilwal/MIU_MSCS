package exampractice.Recursion;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class NthFibonacci {

	public static int fibb(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		return fibb(n - 1) + fibb(n - 2);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(fibb(i));
		}
	}
}
