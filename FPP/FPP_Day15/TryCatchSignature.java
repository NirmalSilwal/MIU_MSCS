package lesson15;

import java.io.FileWriter;
import java.io.IOException;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class TryCatchSignature {

	public static void main(String[] args) {

		try {
			// exception code block inside try block
			FileWriter fw = new FileWriter("myfile");
		} catch (IOException ex) {
			System.out.println("at catch block");
		} finally {
			System.out.println("I will always be excuted");
		}
	}
}

/*
 * you can have try block and finally only without catch block
 * 
 * you can't have try block without catch block or finally block
 * 
 * you can have multiple catch blocks in the order of hierarchy of the
 * Exceptions - specific to generic
 * 
 * inside try block put the code that might throw an exception
 * 
 * note - rethrow the same exception 
 */