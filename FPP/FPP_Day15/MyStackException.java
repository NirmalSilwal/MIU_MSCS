package lesson15;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

// custom exception demo

public class MyStackException extends Exception {

	MyStackException() {
		super();
	}

	MyStackException(String msg) {
		super("Empty stack cannot be accessed");
	}

	MyStackException(int index) {
		super(index + " can't be negative");
	}
}
