package lesson1;

public class GreatestOfThreeValues {

	public static void main(String[] args) {
		int a = 54, b = 22, c = 1;
		
		int ans = (a > b && a > c) ? a : (b > a && b > c) ? b : c;
		
		System.out.println(ans);
	}
}
