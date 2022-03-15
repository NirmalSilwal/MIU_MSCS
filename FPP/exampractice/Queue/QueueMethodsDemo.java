package exampractice.Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class QueueMethodsDemo {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		
		System.out.println(queue);
		System.out.println("size: " + queue.size());
		System.out.println("is empty: " + queue.isEmpty());
		
		System.out.println("removed: " + queue.remove());
		System.out.println(queue);
		System.out.println("size: " + queue.size());
		
		queue.add(40);
		queue.add(50);
		queue.add(null);
		System.out.println(queue);
		
		System.out.println("\ncontains 30: " + queue.contains(30));
		System.out.println("contains 10: " + queue.contains(10));
		System.out.println("contains 50: " + queue.contains(50));
		System.out.println("contains -10: " + queue.contains(-10));
		System.out.println("contains null: " + queue.contains(null));

		
		System.out.println("\nremoved : " + queue.remove());
		System.out.println(queue);
		System.out.println("removed using poll: " + queue.poll());
		System.out.println(queue);
		
		System.out.println("\nfront element: " + queue.element());
		System.out.println(queue.peek());
		
		System.out.println("\nremoving all");
		queue.clear();
		System.out.println(queue);
		System.out.println("size: " + queue.size());
		System.out.println("is empty: " + queue.isEmpty());
	}

}
