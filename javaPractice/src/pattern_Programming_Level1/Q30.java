package pattern_Programming_Level1;

/*
n=5

A
AB
ABC
ABCD
ABCDE
*/
import java.util.Scanner;

public class Q30 {

	public static void getPattern6(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int n = sc.nextInt();
		getPattern6(n);
		sc.close();
	}

}
