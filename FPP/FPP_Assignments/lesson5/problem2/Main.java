package lesson5.problem2;

import java.util.Scanner;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Main {

	public static void main(String[] args) {

		Professor p1 = new Professor("Renuka", 1000000.890, 2020, 1, 10);
		p1.setNumberOfPublications(8);

		Professor p2 = new Professor("Stevellar", 200000.65, 20018, 3, 7);
		p2.setNumberOfPublications(6);

		Professor p3 = new Professor("Elinor", 300000.57, 2016, 5, 8);
		p3.setNumberOfPublications(23);

		Secretary s1 = new Secretary("Michel", 790000.32, 1990, 7, 8);
		s1.setOvertimeHours(48);

		Secretary s2 = new Secretary("Asad", 500000.343, 2010, 4, 6);
		s2.setOvertimeHours(29);

		DeptEmployee[] department = new DeptEmployee[5];

		department[0] = p1;
		department[1] = p2;
		department[2] = p3;
		department[3] = s1;
		department[4] = s2;

		Scanner sc = new Scanner(System.in);

		System.out.println("do you want to see sum of all Professor and Secretary salary in the department?");
		System.out.println("Press 'Y' to see it...\n");

		char ch = sc.next().charAt(0);

		if (ch == 'Y') {
			double totalsalary = 0.0;
			
			for (DeptEmployee person : department) {
				totalsalary += person.computeSalary();
			}
			System.out.println("combined salary of all employees is: " + totalsalary);
		} else {
			System.out.println("Nothing to show...");
		}

		sc.close();
	}
}
