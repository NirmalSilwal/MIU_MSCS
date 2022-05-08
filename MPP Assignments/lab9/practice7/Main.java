package lab9.practice7;

public class Main {

	public static void main(String[] args) {

	
		Person p1 = new Person("Frank Moore","472-5921", 43);
		Person p2 = new Person("Sam Howard","472-722", 55);
		Person p3 = new Person("John Doodle","472-6190", 39);
		
		Faculty faculty1 = new Faculty(10000);
		p1.addRole(faculty1);
		
		Faculty faculty2 = new Faculty(9500);
		p2.addRole(faculty2);
		
		Faculty faculty3 = new Faculty(8600);
		p3.addRole(faculty3);
		
		//faculty3.addCourse();
		
		
		
		Person p4 = new Person("John Doe","472-1121", 22);
		Person p5 = new Person("Mary Jones","472-7322", 32);
		Person p6 = new Person("Lee Johnson","472-6009", 19);
		
		Student st1 = new Student(4.0);
		p4.addRole(st1);
		
		Student st2 = new Student(3.80);
		p5.addRole(st2);
		
		Student st3 = new Student(3.65);
		p6.addRole(st3);
		
		
		Person p7 = new Person("Frank Gore","472-3321", 33);
		Person p8 = new Person("Adam Davis","472-7552", 50);
		Person p9 = new Person("David heck","472-8890", 29);
		
		Staff stf1 = new Staff(4050);
		p7.addRole(stf1);
		
		Staff stf2 = new Staff(5500);
		p8.addRole(stf2);
		
		Staff stf3 = new Staff(3600);
		p9.addRole(stf3);
		
		Course c1 = new Course("CS201", "Programming", 4);
		Course c2 = new Course("CS360", "Database", 3);
		Course c3 = new Course("CS404", "Compilers", 4);
		Course c4 = new Course("CS240", "Data Structure", 2);
		Course c5 = new Course("CS301", "Software Engineering", 3);
		Course c6 = new Course("CS450", "Advanced Architecture", 3);
		
		faculty3.addCourse(c1);
		faculty2.addCourse(c2);
		faculty3.addCourse(c3);
		faculty3.addCourse(c4);
		faculty2.addCourse(c5);
		faculty1.addCourse(c6);
		
		
		st1.addCourse(c1);
		st1.addCourse(c2);
		st1.addCourse(c3);
		st1.addCourse(c5);
		
		
		st2.addCourse(c1);
		st1.addCourse(c3);
		st1.addCourse(c6);
		
		st3.addCourse(c1);
		st3.addCourse(c2);
		st3.addCourse(c4);
		st3.addCourse(c6);
		
		
		Department dept = new Department("Computer Science");
		dept.addPerson(p1);
		dept.addPerson(p2);
		dept.addPerson(p3);
		dept.addPerson(p4);
		dept.addPerson(p5);
		dept.addPerson(p6);
		dept.addPerson(p7);
		dept.addPerson(p8);
		dept.addPerson(p9);
		
		System.out.println("Department total Salary: "+ dept.getTotalSalary());
		dept.showAllMembers();
		dept.unitsPerFaculty();
		
		
		//Level 3
		//John Does is a staff as well as student
		Staff stf4 = new Staff(5700);
		p4.addRole(stf4);
		

		System.out.println("Department total Salary after making John Doe a staff: "+ dept.getTotalSalary());
		dept.showAllMembers();
		dept.unitsPerFaculty();
	}

}
