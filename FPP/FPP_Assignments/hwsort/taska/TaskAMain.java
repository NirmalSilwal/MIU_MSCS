package hwsort.taska;

import java.util.Arrays;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class TaskAMain {

	public static void main(String[] args) {
		
		DeptEmployee[] emp = DeptEmployeeData.getDeptData();
		
		System.out.println("Before sorting...\n");
		for (DeptEmployee e : emp) {
			System.out.println(e);
		}
		
		System.out.println("\nAfter sorting...\n");
		
		NameComparator mycomparator = new NameComparator();
		
		Arrays.sort(emp, mycomparator);
		
		for (DeptEmployee e : emp) {
			System.out.println(e);
		}
	}

}
