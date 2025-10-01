package pattern_Programming_Level1;

/*
n=5
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/
import java.util.Scanner;

public class Q19 {

	public static void getPattern6(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
					System.out.print(j+" ");
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
