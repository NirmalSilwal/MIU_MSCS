package lesson4;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class TestingProblem13 {

	@Test
	public void test1() {

		Exponential expobj = new Exponential();
		double myOutput = expobj.power(2, 10);
		double expectedOutput = 1024.0;

		assertEquals(myOutput, expectedOutput, 0.0);
	}

	@Test
	public void test3() {
		
		BinarySearchRecursive binobj = new BinarySearchRecursive();
		int[] arr = { 3, 4, 21, 27, 34, 67, 98, 978, 999 };

		int myOutput = binobj.binarySearch(arr, 21);
		int expectedOutput = 2;

		assertEquals(myOutput, expectedOutput);
	}
}
