package lesson8.prob4;

public class DoublyLinkedList {

	Node header;

	DoublyLinkedList() {
		header = new Node();
	}

	// adds to the end of the list
	public void addLast(String item) {
		// implement
		if (item == null)
			return;
		Node newnode = new Node(null, item, null);

		Node temp = header;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newnode;
		newnode.previous = temp;
	}

	public boolean remove(String item) {
		// Implement
		if (header.next == null)
			return false;

		int position = findItem(item);
		if (position == -1)
			return false; // item not found

		// now removing from list
		Node temp = header;
		for (int i = 0; i < position; i++) {
			temp = temp.next;
		}

		if (temp.next.next == null) {
			temp.next = null;
		} else {
			temp.next.next.previous = temp;
			temp.next = temp.next.next;
		}
		return true;
	}

	private int findItem(String item) {
		if (item == null)
			return -1;

		int foundidx = -1;
		Node temp = header;

		while (temp.next != null) {
			foundidx++;
			temp = temp.next;
			if (temp.value.equals(item)) {
				return foundidx;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		toString(sb, header);
		return sb.toString();
	}

	private void toString(StringBuilder sb, Node n) {
		if (n == null)
			return;
		if (n.value != null)
			sb.append(" " + n.value);
		toString(sb, n.next);
	}

	class Node {
		String value;
		Node next;
		Node previous;

		public String toString() {
			return value == null ? "null" : value;
		}

		Node() {
			this.value = "";
			this.next = null;
			this.previous = null;
		}

		Node(Node previous, String value, Node next) {
			this.value = value;
			this.next = next;
			this.previous = previous;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addLast("Bob");
		list.addLast("Harry");
		list.addLast("Steve");
		list.addLast("Nirmal");
		list.addLast("Dinesh");

		System.out.println("list after adding at last");
		System.out.println(list);


		System.out.println("\nremoving Bob");
		list.remove("Bob");
		System.out.println(list);

		System.out.println("\nremoving Steve");
		list.remove("Steve");
		System.out.println(list);

		System.out.println("\nremoving Dinesh");
		list.remove("Dinesh");
		System.out.println(list);

	}
}
