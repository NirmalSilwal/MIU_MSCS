package exampractice;

import java.util.Arrays;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class test {

	public static void main(String[] args) {

		String s = "nirmal";
		String t = "silwal";
		System.out.println(s.compareTo(t));;

		System.out.println("testing....\n");

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int foundid = 3;

		int[] temp = new int[arr.length];

		System.arraycopy(arr, 0, temp, 0, foundid);
		System.arraycopy(arr, foundid + 1, temp, foundid, arr.length - foundid - 1);
		System.out.println(Arrays.toString(temp));
	}
}
