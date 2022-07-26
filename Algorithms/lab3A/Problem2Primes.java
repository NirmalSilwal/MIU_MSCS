package lab3A;

public class Problem2Primes {

	static boolean isPrime(int n) {
		if (n == 0 || n == 1)
			return false;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		for (int i = 0; i <= 30; i++) {
			if (isPrime(i))
				System.out.println(i);
		}

	}
}
