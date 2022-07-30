package lab5.problem1;

import java.util.Arrays;
import java.util.Objects;

// stack implementation using Array

public class MinStack {

	private int[] data;
	private int top;
	private int size;
	private int minValue;

	private final int DEFAULT_CAPACITY = 20;

	public MinStack() {
		this.data = new int[DEFAULT_CAPACITY];
		this.top = -1;
		size = 0;
		minValue = Integer.MAX_VALUE;
	}

	public MinStack(int capacity) {
		this.data = new int[capacity];
		this.top = -1;
		size = 0;
		minValue = Integer.MAX_VALUE;
	}

	public void push(int value) {

		if (top + 1 == data.length) { // stack was full
			resize();
		}

		top++;
		data[top] = value;
		size++;

		if (value < this.minValue)
			minValue = value;
	}

	private void resize() {
		int[] copiedData = new int[data.length * 2];
		System.arraycopy(data, 0, copiedData, 0, data.length);
		this.data = copiedData; // changing reference of original array
	}

	public int pop() throws Exception {
		if (isEmpty())
			throw new Exception("Stack is empty... nothing to pop");

		int poppedValue = data[top];
		top--;
		size--;

		// adjusting min value again since minValue could be popped value
		minValue = Integer.MAX_VALUE;
		for (int i = 0; i <= top; i++) {
			if (data[i] < minValue)
				minValue = data[i];
		}

		return poppedValue;
	}

	public int peek() throws Exception {
		if (isEmpty())
			throw new Exception("Stack is empty... nothing to peek");

		return data[top];
	}

	public boolean isEmpty() {
		return size == 0 || data.length == 0;
	}

	public int min() throws Exception {
		if (size == 0)
			throw new Exception("stack is empty, no such elements found....");
		return this.minValue;
	}

	public void display() {
		System.out.println("-------- displaying Stack ------------");
		for (int i = top; i >= 0; i--) {
			System.out.println(data[i]);
		}
		System.out.println("--------------------");
	}

	@Override
	public String toString() {
		return "MinStack [data=" + Arrays.toString(data) + ", top=" + top + ", size=" + size + ", minValue=" + minValue
				+ ", DEFAULT_CAPACITY=" + DEFAULT_CAPACITY + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(data);
		result = prime * result + Objects.hash(DEFAULT_CAPACITY, minValue, size, top);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MinStack other = (MinStack) obj;
		return DEFAULT_CAPACITY == other.DEFAULT_CAPACITY && Arrays.equals(data, other.data)
				&& minValue == other.minValue && size == other.size && top == other.top;
	}

}
