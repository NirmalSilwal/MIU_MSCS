package lab2.prob2A;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student("nirmal");
		
		student1.getGradeReport().setGrade("A+");
		
		System.out.println(student1.getGradeReport());
	}

}
