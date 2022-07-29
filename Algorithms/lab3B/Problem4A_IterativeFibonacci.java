package lab3B;

public class Problem4A_IterativeFibonacci {

	// O(n) time, O(1) space

	public static int fibonacciIterative(int n) {
		if (n == 0 || n == 1)
			return n;

		int prev = 0, front = 1;

		for (int i = 2; i <= n; i++) {
			int curr = prev + front;
			prev = front;
			front = curr;
		}

		return front;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.print(fibonacciIterative(i) + " ");
		}
	}
}

/*
 * output:
 * 
 * 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181
 */