package lesson12;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

// doubly linked list
public class Node {

	int data;
	Node next;
	Node prev;

	Node() {
		this.data = 0;
		this.next = null;
		this.prev = null;
	}

	Node(int data, Node prev, Node next) {
		this.data = data;
		this.next = next;
		this.prev = prev;
	}

	@Override
	public String toString() {
		return this.data + " ";
	}
}
