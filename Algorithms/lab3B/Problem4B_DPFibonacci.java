package lab3B;

public class Problem4B_DPFibonacci {

	// using dynamic programming in recursion
	// O(n) time, O(n) space

	public static int fibonacci(int n) {
		if (n == 0 || n == 1)
			return n;

		int[] storage = new int[n + 1];
		storage[0] = 0;
		storage[1] = 1;

		return fibonacciTopDownDP(n, storage);
	}

	private static int fibonacciTopDownDP(int n, int[] storage) {
		if (n == 0 || n == 1)
			return n;

		if (storage[n] != 0) {
			return storage[n];
		}
		int answer = fibonacciTopDownDP(n - 1, storage) + fibonacciTopDownDP(n - 2, storage);

		storage[n] = answer;

		return answer;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}
}
