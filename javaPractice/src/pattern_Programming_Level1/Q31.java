package pattern_Programming_Level1;

/*
n=5
E
DD
CCC
BBBB
AAAAA
*/
import java.util.Scanner;

public class Q31 {

	public static void getPattern6(int n) {
		int star=n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print((char)(star+64));
			}
			star--;
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
