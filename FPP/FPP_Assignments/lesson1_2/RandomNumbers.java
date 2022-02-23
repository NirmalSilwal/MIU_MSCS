package lesson1_2;

import java.util.Random;

/**
 * This class keeps hold of an instance of Random and guarantees that the same
 * instance will be used over and over (so the cost of re-seeding the random
 * number generator is avoided). Each time the getRandomInt() method is called,
 * the next integer from this Random instance is returned.
 */
public class RandomNumbers {

	static Random random;

	private RandomNumbers() {
		random = new Random();
	}

	/**
	 * Use this method to get a random integer, with a call like this: int myInt =
	 * RandomNumbers.getRandomInt();
	 */
	public static int getRandomInt() {
		if (random == null)
			new RandomNumbers();
		return random.nextInt();
	}

	/**
	 * Returns a random integer x satisfying lower <= x <= upper. If lower > upper,
	 * returns 0.
	 * 
	 * @param lower
	 * @param upper
	 * @return
	 */
	public static int getRandomInt(int lower, int upper) {
		if (lower > upper)
			return 0;
		if (lower == upper)
			return lower;
		int difference = upper - lower;
		int start = getRandomInt();

		// nonneg int in the range 0..difference - 1
		start = Math.abs(start) % (difference + 1);

		start += lower;
		return start;
	}

	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt() + " " + r.nextInt() + " " + r.nextInt() + " " + r.nextInt());
		r = new Random();
		System.out.println(r.nextInt() + " " + r.nextInt() + " " + r.nextInt() + " " + r.nextInt());
		r = new Random();
		System.out.println(r.nextInt() + " " + r.nextInt() + " " + r.nextInt() + " " + r.nextInt());
		r = new Random();
		System.out.println(r.nextInt() + " " + r.nextInt() + " " + r.nextInt() + " " + r.nextInt());
		String s = "hello";
		char c = s.charAt(0);
		char d = s.charAt(1);
		System.out.println(c + " " + d + " " + (char) (c + d));
	}

}