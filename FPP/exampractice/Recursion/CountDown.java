package exampractice.Recursion;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class CountDown {

	public static void countDownNum(int n) {
		
		if (n <= 0)
			return;
		
		System.out.println(n);
		
		countDownNum(n - 1);
	}
	
	public static void main(String[] args) {
		countDownNum(5);
	}
}
