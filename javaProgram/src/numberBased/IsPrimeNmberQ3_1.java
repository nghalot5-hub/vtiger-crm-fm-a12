package numberBased;

import java.util.Scanner;

public class IsPrimeNmberQ3_1 {
	public static void isRangePrimeNmber(int n) {
		int count = 0; int i;
		for (i = 2;; i++) {
			if (isPrimeNumber(i)) {
				count++;
				if (count == n) 
				}
				
			}
			System.out.println(i + " is a prime number");
			break
		}
		i++;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range: ");
		int n = sc.nextInt();
		isRangePrimeNmber(n);
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
