package lesson1_2;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Prog4 {

	public static void main(String[] args) {

		// storing all given float variables
		float var1 = 1.27f;
		float var2 = 3.881f;
		float var3 = 9.6f;

		// part 1
		int sum1 = (int) (var1 + var2 + var3);
		System.out.println("first sum: " + sum1);

		// part 2
		int sum2 = Math.round(var1 + var2 + var3);
		System.out.println("second sum: " + sum2);
	}
}
