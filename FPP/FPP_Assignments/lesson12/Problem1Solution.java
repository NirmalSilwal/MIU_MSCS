package lesson12;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Problem1Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the score in the range 0 to 100:");

		try {
			int score = sc.nextInt();

			if (score >= 0 && score <= 100)
				System.out.println("\nscore input taken.... " + score);
			else
				throw new UnsupportedOperationException();

		} catch (InputMismatchException ex) {
			System.out.println("\ninput mismatch...");

		} catch (UnsupportedOperationException ex) {
			System.out.println("\nunsupported operation.... input is not in the range 0 to 100");
		}

		finally {
			sc.close();
		}
	}
}