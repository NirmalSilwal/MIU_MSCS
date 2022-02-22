package lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello from MIU");
		
		// escape character demo
		System.out.println("Use \"\\t\" to produce a tab.");
		
		
		// read user input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nenter any number - ");

		int n = Integer.parseInt(br.readLine());
		System.out.println(n);
		
		System.out.println("\nenter any text - ");
		
		String str = br.readLine();
		System.out.println("i am added - " + str);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nenter temp");
		double mytemp = sc.nextDouble();
		
		System.out.println("\ntodays temperature is - " + mytemp);
		
		sc.close();
		
		
		// random number demo
		
		Random r = new Random();
		int myrandomint = r.nextInt();
		System.out.println("random num is - "+ myrandomint);
		
		
	}
}
