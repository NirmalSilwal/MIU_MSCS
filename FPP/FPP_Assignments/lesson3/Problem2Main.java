package lesson3;

import java.util.Scanner;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Problem2Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter your first name: ");
		String fname = sc.nextLine();
		
		System.out.println("Please, enter your last name: ");
		String lname = sc.nextLine();
		
		System.out.println("Please, enter your birth date in the format-(yyyy-mm-dd):  ");
		String dob = sc.nextLine();
		
		HeartRates myheartrate = new HeartRates(fname, lname, dob);
		
		myheartrate.getTargetHeartRateRange();
		
		System.out.println(myheartrate);
	
		sc.close();
	}

}
