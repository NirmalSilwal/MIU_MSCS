package examPractice.lab2Problem2;

public class DriverClass {

	public static void main(String[] args) {

		Student st1 = new Student("Nirmal");

		st1.getGradeReport().setGrade("A");

		System.out.println(st1.getGradeReport());
	}

}
