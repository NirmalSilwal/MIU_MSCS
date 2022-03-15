package exampractice.Stacks;

import java.util.Stack;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class StackMethodsDemo {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		System.out.println(stack.isEmpty());

		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println(stack);
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());

		System.out.println("peek " + stack.peek());
		System.out.println(stack.size());

		System.out.println("popped " + stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		
		System.out.println(stack);
	}
}
