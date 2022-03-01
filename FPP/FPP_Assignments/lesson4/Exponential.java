package lesson4;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Exponential {

	public double power(double x, int n) {
		// base cases
		if (n == 0)
			return 1;
		if (n == 1)
			return x;

		double exponent = x * power(x, n - 1);

		return exponent;
	}

	public static void main(String[] args) {

		Exponential findExponent = new Exponential();

		System.out.println(findExponent.power(2, 10));
	}
}
