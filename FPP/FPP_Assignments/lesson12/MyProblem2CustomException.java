package lesson12;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

class MyProblem2CustomException extends Exception {

	private static final long serialVersionUID = 1L;

	public MyProblem2CustomException() {
		super();
	}

	public MyProblem2CustomException(String msg) {
		super(msg);
	}
}
