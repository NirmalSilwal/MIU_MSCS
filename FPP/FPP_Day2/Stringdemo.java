package lesson2;

import java.util.Arrays;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Stringdemo {
 
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		String str5 = str4;
		
		System.out.println(str1 == str2); // true
		System.out.println(str2 == str3); // false
		System.out.println(str3 == str4); // false
		System.out.println(str4 == str5); // true
		System.out.println(str3.equals(str4)); // true
		
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		String s = "hello,how,are,you,man";
		String[] words = s.split(",");
		System.out.println(words);
		System.out.println(Arrays.toString(words));
	}
}
