package lesson9.labs.prob1.business;

import java.io.Serializable;

public class LoginException extends Exception implements Serializable {

	public LoginException() {
		super();
	}
	public LoginException(String msg) {
		super(msg);
	}
	public LoginException(Throwable t) {
		super(t);
	}
	private static final long serialVersionUID = 8978723266036027364L;
	
}
