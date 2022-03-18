package lesson9;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

// stack implementation using singly linked list
interface StackSLL {

	public void push(Object obj);

	public Object pop();

	public Object peek();

	public int size();

	public boolean isEmpty();
}

public class StackUsingLinkedList implements StackSLL {

	private class Node {
		Object value;
		Node next;

		Node(Object value, Node next) {
			this.value = value;
			this.next = next;
		}
	}

	// instance members
	int top = -1; // to track size
	Node header; // initial position

	StackUsingLinkedList() {
		header = new Node(null, null);
	}

	public void push(Object obj) {
		if (obj == null)
			return;

		Node newnode = new Node(obj, null);
		top++;
		newnode.next = header;
		header = newnode;
	}

	public Object pop() {
		if (header.next == null) {
			System.out.println("Stack is empty, nothing to remove");
			return null;
		}
		Object removedNode = header.value;
		header = header.next;
		top--;
		return removedNode;
	}

	public Object peek() {
		if (isEmpty())
			return null;
		return header.value;
	}

	public int size() {
		return top + 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void display() {
		Node temp = header;
		while (temp.next != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
		System.out.println("-----------");
	}

	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		System.out.println("stack is empty " + stack.isEmpty() + "\n");

		stack.push(1);
		System.out.println("item at top/peek " + stack.peek() + "\n");
		stack.push(2);
		System.out.println("size is " + stack.size() + "\n");
		stack.push(3);

		System.out.println("stack is empty " + stack.isEmpty() + "\n");

		stack.push(4);
		stack.push(5);
		stack.display();

		System.out.println("item at top/peek " + stack.peek() + "\n");
		System.out.println("size is " + stack.size() + "\n");

		System.out.println("popped item  " + stack.pop() + "\n");
		stack.display();
		System.out.println("item at top/peek " + stack.peek() + "\n");

		System.out.println("popped item  " + stack.pop());
		System.out.println();
		System.out.println("stack is empty " + stack.isEmpty() + "\n");
		System.out.println("size is " + stack.size() + "\n");

		stack.display();
		System.out.println("item at top/peek " + stack.peek() + "\n");
		System.out.println("size is " + stack.size() + "\n");

	}
}
