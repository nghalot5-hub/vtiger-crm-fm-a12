package pattern_Programming_Level1;
/*
n=5

10101
10101
10101
10101
10101
*/
import java.util.Scanner;

public class Q4 {

	public static void getPattern4(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j%2!=0)
					System.out.print(1);
				else
					System.out.print(0);
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int n = sc.nextInt();
		getPattern4(n);
		sc.close();
	}

}
