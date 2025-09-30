package pattern_Programming_Level1;

/*
n=5

*   * * * 
*   *     
* * * * * 
    *   * 
* * *   * 
*/
import java.util.Scanner;

public class Q11 {

	public static void getPattern6(int n) {
		int mid = n / 2 + 1;
		if (n % 2 == 0) {
			System.out.println("Pattern is Not Possible for Even Row!");
			return;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j==mid || i==mid ||i>mid&&j==n || j>mid && i==1 ||i<mid &&j==1 ||j<mid &&i==n)
					System.out.print("* ");
				else
					System.out.print("  ");
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
