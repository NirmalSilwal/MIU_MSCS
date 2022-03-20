package lesson15;

import java.util.Scanner;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class ExceptionHandlingDiscussion {

	/*
	 * checked exceptinon, compiler force the developer to deal it
	 * 
	 * unchecked exceptions are called runtime exceptions
	 * 
	 * throw is a keyword used with statement level exception to throw runtime
	 * exceptions
	 * 
	 * throws keyword is useful to throw at the method level exception
	 * 
	 * possible options for the try, catch signature
	 * 
	 * 1. Try, catch(exception type with object name), finally {}
	 * 
	 * 2. try, catch (exception type object)
	 */

	public static void main(String[] args) {

		// runtime exceptions demo

		// 1. arithmetic exception

//		System.out.println(12/0); 

		// 2. class cast exception

//		Object a = new Integer(20);
//		String str = (String)a;
//		System.out.println(str);

		// 3. null pointer exception

//		String s = null;
//		System.out.println(s.length());
//	
//		Float[] f = new Float[30];
//		System.out.println(f[0].compareTo(12.5f));

//		4. array index out of bounds exception

//		int[] arr = new int[5];
//		System.out.println(arr[5]);

		// 5. number format exception

//		String x = "10s";
//		int res = Integer.valueOf(x); // OR, Integer.parseInt(x);
//		System.out.println(res);

//		6. Input mismatch exception

//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter int value ");
//		int n = sc.nextInt();

	}
}
