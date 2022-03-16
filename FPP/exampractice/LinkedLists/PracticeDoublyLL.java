package exampractice.LinkedLists;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class PracticeDoublyLL {

	private class Node {
		String data;
		Node next;
		Node prev;

		Node(Node prev, String data, Node next) {
			this.data = data;
			this.next = next;
			this.prev = prev;
		}
	}

	Node header;

	PracticeDoublyLL() {
		header = new Node(null, null, null);
	}

	public void addFirst(String value) {
		if (value == null)
			throw new NullPointerException("null value is passed...");

		Node newNode = new Node(header, value, header.next);

		if (header.next != null) {
			header.next.prev = newNode;
		}
		header.next = newNode;
	}

	public void addLast(String value) {
		if (value == null)
			throw new NullPointerException();
		if (header.next == null)
			addFirst(value);

		Node temp = header;
		while (temp.next != null) {
			temp = temp.next;
		}

		Node newNode = new Node(temp, value, null);
		newNode.prev = temp;
		temp.next = newNode;
	}

	public String deleteFirst() {
		if (header.next == null)  
			return null;
		String deleted = header.next.data;

		header.next.next.prev = header;
		header.next = header.next.next;

		return deleted;
	}

	public String deleteLast() {
		if (header.next == null)
			return null;

		Node temp = header;
		while (temp.next != null) {
			temp = temp.next;
		}
		String ans = temp.data;

		Node secondLast = temp.prev;

		secondLast.next.prev = null;
		secondLast.next = null;

		return ans;
	}

	public int size() {
		int total = 0;
		if (header == null)
			return 0;
		Node temp = header;
		while (temp.next != null) {
			temp = temp.next;
			total++;
		}
		return total;
	}

	public boolean isEmpty() {
		return header.next == null;
	}

	public void display() {
		Node temp = header;
		while (temp.next != null) {
			temp = temp.next;
			System.out.print(temp.data + " ");
		}

		System.out.println("\n-------");
	}

	public static void main(String[] args) {

		PracticeDoublyLL list = new PracticeDoublyLL();

		System.out.println("isempty " + list.isEmpty());
		list.display();
		list.addFirst("first");
		list.addFirst("second");
		list.display();
		System.out.println("size: " + list.size());
		System.out.println("deleted first: " + list.deleteFirst());
		list.display();
		System.out.println("isempty " + list.isEmpty());
		System.out.println("size: " + list.size());
		list.addFirst("third");
		list.display();
		System.out.println("isempty " + list.isEmpty());

		list.addLast("FOURTH");
		list.addLast("FIFTH");
		System.out.println("isempty " + list.isEmpty());

		list.addLast("SIXTH");
		System.out.println();
		list.display();
		System.out.println("deleted first: " + list.deleteFirst());
		System.out.println("deleted first: " + list.deleteFirst());
		System.out.println();
		list.display();

		System.out.println("\ndelete last: " + list.deleteLast());
		System.out.println("size: " + list.size());
		list.display();
	}
}
