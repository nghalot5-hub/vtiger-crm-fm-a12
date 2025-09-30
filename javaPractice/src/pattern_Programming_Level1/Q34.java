package pattern_Programming_Level1;

/*
n=5
    1
   00
  111
 0000
11111

*/
import java.util.Scanner;

public class Q34 {

	public static void getPattern6(int n) {
		int space = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++) {
				if(i%2==0)
					System.out.print(0);
				else
					System.out.print(1);
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
