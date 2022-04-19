package examPractice.lesson7;

// not thread safe
public class SingletonPractice {

	private static SingletonPractice INSTANCE;
	
	private SingletonPractice() {
		System.out.println("called once");
	}
	
	public static SingletonPractice getInstance() {
		if (INSTANCE == null)
			INSTANCE = new SingletonPractice();
		return INSTANCE;
	}
	
	public static void main(String[] args) {
		SingletonPractice ston = new SingletonPractice();
		SingletonPractice s1 = new SingletonPractice();
		SingletonPractice s3 = new SingletonPractice();
		SingletonPractice s4 = new SingletonPractice();

		System.out.println("----");
		s1.getClass();
		ston.getInstance();
		s3.getInstance();
		s4.getInstance();
	}

}

