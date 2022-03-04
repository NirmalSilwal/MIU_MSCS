package lesson5.problem5;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Problem5Main {

	public static void main(String[] args) {

		Computer macair = new Computer("Apple", "M1 chip", 16, 5);

		Computer macair2 = new Computer("Apple", "M1 chip", 16, 5);

		Computer dell = new Computer("Dell", "Risen", 8, 3.5);

		System.out.println(macair.equals(macair2)); // true
		System.out.println(macair2.equals(dell)); // false

//		System.out.println(macair);
	}

}
