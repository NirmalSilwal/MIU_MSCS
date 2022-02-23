package lesson2;

import java.util.Scanner;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class FindCharacterOccurrances {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter your name: ");

		String name = sc.nextLine();
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'e') {
				count++;
			}
		}

		System.out.println(count);

		// 2nd approach
		int count1 = 0;
		for (char ch : name.toCharArray()) {
			if (ch == 'e') {
				count1++;
			}
		}

		System.out.println(count1);
		sc.close();
	}
}
