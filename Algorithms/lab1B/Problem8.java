package lab1B;

public class Problem8 {

	public static int smallestCommon(int x, int y) {
		// implement
		int gcd = computeGCD(x, y);

		return (x * y) / gcd;
	}

	private static int computeGCD(int x, int y) {
		if (y == 0)
			return x;

		return computeGCD(y, x % y);
	}

	public static void main(String[] args) {
		System.out.println(smallestCommon(4, 6));
		System.out.println(smallestCommon(3, 5));
		System.out.println(smallestCommon(7, 14));
		System.out.println(smallestCommon(15, 20));
	}
}
