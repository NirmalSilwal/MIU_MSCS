package lesson1_2;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Prog1 {

	public static void main(String[] args) {

		/* 1. get a random number x in the range 1 .. 9 and compute π^x */

		int random_x = RandomNumbers.getRandomInt(1, 9);
		System.out.println(Math.pow(Math.PI, random_x));

		/* 2. get a random number y in the range 3 .. 14 and compute y^π */

		int random_y = RandomNumbers.getRandomInt(3, 14);
		System.out.println(Math.pow(random_y, Math.PI));

	}
}
