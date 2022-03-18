package lesson9;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class ArrayQueueImpl {

	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;
	int count = 0;

	public void enqueue(int value) {
		if (rear == arr.length - 1)
			resize();

		if (front == -1) {
			arr[rear] = value;
			front++;
		} else {
			rear++;
			arr[rear] = value;
		}
		count++;
	}

	public void resize() {
		int[] temparr = new int[arr.length * 2];
		System.arraycopy(arr, 0, temparr, 0, arr.length);
		arr = temparr;
	}

	public int dequeue() {
		if (isEmpty() || front > rear) {
			System.out.println("Queue is Empty, nothing to remove");
			return -1;
		}
		int removedItem = arr[front];
		arr[front] = 0; // this is optional
		front++;

		count--;

		return removedItem;
	}

	public boolean isEmpty() {
		return (front == -1 || front > rear);
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is Empty, returning -1");
			return -1;
		}
		return arr[front];
	}

	public int size() {
		return count;
	}

	public void display() {
		if (front > rear)
			return;
		if (front == -1) {
			System.out.println("printing...... -> queue is empty");
			return;
		}
		System.out.print("printing.... -> ");
		for (int i = front; i <= rear; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {

		ArrayQueueImpl queue = new ArrayQueueImpl();

		System.out.println("queue initially...");
		System.out.println("is empty " + queue.isEmpty());
		System.out.println("size " + queue.size());
		System.out.println("peak item " + queue.peek());

		queue.display();
		System.out.println();

		System.out.println("size " + queue.size());
		queue.enqueue(1);
		System.out.println("size " + queue.size());
		System.out.println("is empty " + queue.isEmpty());
		queue.display();

		queue.enqueue(2);
		System.out.println("peak item " + queue.peek());
		queue.display();
		System.out.println("peak item " + queue.peek());
		System.out.println("size " + queue.size());
		System.out.println("is empty " + queue.isEmpty());

		queue.enqueue(3);
		queue.display();

		System.out.println("\nremoved item " + queue.dequeue());
		queue.display();
		System.out.println("peak item " + queue.peek());
		System.out.println("size " + queue.size());
		System.out.println("is empty " + queue.isEmpty());

		System.out.println();
		queue.enqueue(4);
		queue.display();
		queue.enqueue(5);
		queue.display();

	}
}
