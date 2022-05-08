package lab8.assignment;

import java.util.function.Supplier;

public class Problem1Biii {

	public static void main(String[] args) {

		System.out.println(new Problem1Biii.MySupplier().get());
	}

	static class MySupplier implements Supplier {

		@Override
		public Double get() {
			return Math.random();
		}

	}

}
