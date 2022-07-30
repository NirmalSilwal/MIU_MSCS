package lab5.problem1;

public class Main {

	public static void main(String[] args) throws Exception {

		MinStack stack = new MinStack();

		System.out.println("stack empty: " + stack.isEmpty());

		stack.push(10);
		stack.push(2);
		System.out.println("min value: " + stack.min());

		stack.push(11);
		stack.push(4);
		System.out.println("min value: " + stack.min());

		stack.push(5);

		stack.display();
		System.out.println("min value: " + stack.min());

		System.out.println("peek value: " + stack.peek());

		System.out.println("stack empty: " + stack.isEmpty());

		System.out.println("min value: " + stack.min());

		int poppedValue = stack.pop();
		System.out.println("popped value: " + poppedValue);

		stack.display();

		System.out.println("peek value: " + stack.peek());

		System.out.println("min value: " + stack.min());
	}

}
