package lesson9.labs.prob1.business;

import java.io.Serializable;

public class LibrarySystemException extends Exception implements Serializable {
	
	private static final long serialVersionUID = 3326915348398932420L;
	public LibrarySystemException() {
		super();
	}
	public LibrarySystemException(String msg) {
		super(msg);
	}
	public LibrarySystemException(Throwable t) {
		super(t);
	}
}
