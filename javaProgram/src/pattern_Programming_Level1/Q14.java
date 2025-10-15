package pattern_Programming_Level1;

/*
n=5

*****
****
***
**
*
*/
import java.util.Scanner;

public class Q14 {

	public static void getPattern6(int n) {
		int star=n;
		for (int i = 1; i <= n; i++) {
			for (int j = star; j > 0; j--) {
				System.out.print("*");
		
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
