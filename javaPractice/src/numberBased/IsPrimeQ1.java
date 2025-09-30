package numberBased;

import java.util.Scanner;

public class IsPrimeQ1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		if (isPrimeNumber(n)) {
			System.out.println(n + " is prime number");
		} else {
			System.out.println(n + " is not prime number");
		}
		sc.close();
	}

	public static boolean isPrimeNumber(int n) {
		if (n < 2) {
			return false;
		}

		else if (n == 2)
			return true;
		else if (n % 2 == 0) {
			return false;
		}

		for (int i = 3; i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}

		return true;

	}
}
