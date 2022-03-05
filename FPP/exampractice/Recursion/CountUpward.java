package exampractice.Recursion;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class CountUpward {

	public static void countUp(int n) {
		
		if (n <= 0)
			return;
		
		countUp(n - 1);
		
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		countUp(5);
	}
}
