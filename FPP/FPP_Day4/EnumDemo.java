package lesson4;

import java.util.Arrays;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class EnumDemo {

	enum Size {
		SMALL, MEDIUM, LARGE;
	}

	public static void main(String[] args) {

		Size sizes = Size.MEDIUM;

		System.out.println(sizes);

		for (Size s : Size.values()) {
			System.out.println(s);
		}

		System.out.println(Arrays.toString(sizes.values()));
	}
}
