package lesson12;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class TestNode {

	public static void main(String[] args) {
		
		// create a header node and assign the value 10
		Node head = new Node(); 
		head.data = 10;
		
		System.out.println(head); // toString() was overridden
		
		Node n1 = new Node();
		n1.data = 20;
		
		head.next = n1;
		n1.prev = head;
		
		System.out.println(n1.data);
		System.out.println(head.next);
		System.out.println(n1.prev);
		
		System.out.println();
		
		Node n2 = new Node();
		n2.data = 30;
		
		n1.next = n2;
		
		Node n3 = new Node();
		n3.data = 40;
		
		n2.next = n3;
		n2.prev = n1;
		
		n3.prev = n2;
		
		
		// sum of all DLL data values
		int sum = 0;
		System.out.println("DLL traversal");
		for (Node temp = head; temp != null; temp = temp.next) {
			System.out.println(temp.data);
			sum += temp.data;
		}
		
		System.out.println("sum of values in DLL is " + sum);
		
		System.out.println("\nusing while loop to find sum of all data in DLL\n");
		
		Node temp = head;
		int sum2 = 0;
		while (temp != null) {
			sum2 += temp.data;
			temp = temp.next;
		}
		
		System.out.println("sum2 is "+sum2);
	}
}
