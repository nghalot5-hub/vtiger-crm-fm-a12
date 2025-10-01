package pattern_Programming_Level1;

/*
n=5
* * * * * 
  * * * * 
    * * * 
      * * 
        * 
*/
import java.util.Scanner;

public class Q16 {

	public static void getPattern6(int n) {
		int space = 0, star=n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for(int k=star; k>0;k--) {
				System.out.print("* ");
			}
			space++; star--;
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
