package pattern_Programming_Level1;
/*
n=5
12345
12345
12345
12345
12345
*/
import java.util.Scanner;

public class Q3 {

	public static void getPattern1(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int n = sc.nextInt();
		getPattern1(n);
		sc.close();
	}

}
