package lab1B;

// fibonacci sequence
public class Problem7 {

	// approach 1 - recursive solution

	public static int generate(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		// implement

		return generate(n - 1) + generate(n - 2);
	}

	// approach 2 - iterative solution, this one is better than recursive solution
	// because it won't take extra recursive stack memory which the recursion takes

	public static int generate2(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		// implement

		int back = 0, mid = 1;
		int front = Integer.MIN_VALUE; // just initialization

		for (int i = 2; i <= n; i++) {
			front = back + mid;
			back = mid;
			mid = front;
		}

		return front;
	}

	public static void main(String[] args) {

		for (int i = 0; i <= 20; ++i) {
			System.out.println(generate2(i));
		}
	}
}
