package exampractice.Recursion;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Exponential {

	public static double power(double x, int n) {
		if (x == 0)
			return 0;
		if (n == 0)
			return 1;
		if (n == 1)
			return x;
		
		return x * power(x, n - 1);
	}
	
	public static void main(String[] args) {
		System.out.println(power(2, 10));
	}
}
