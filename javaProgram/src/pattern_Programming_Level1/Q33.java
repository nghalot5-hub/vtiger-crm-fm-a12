package pattern_Programming_Level1;

/*
n=5
    1
   22
  333
 4444
55555
*/
import java.util.Scanner;

public class Q33 {

	public static void getPattern6(int n) {
		int space = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++) {
				System.out.print(i);
			}
			space--;
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
