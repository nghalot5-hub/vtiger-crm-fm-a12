package numberBased;

import java.util.Scanner;

public class IsPrimeNmberQ2 {
	public static void printPrimesInRange(int end) {
		int count=0;
	for (int i = 2; i <= end; i++) {
        if (isPrimeNumber(i)) {
            System.out.print(i + " ");
            count++;
        }
    }
    System.out.println("\nTotal primes found: " + count);
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range: ");
		int n = sc.nextInt();
		printPrimesInRange(n);
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
