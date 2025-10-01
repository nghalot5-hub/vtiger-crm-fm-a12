package pattern_Programming_Level1;

/*
n=5
11111
00000
11111
00000
11111
 */

import java.util.Scanner;

public class Q2 {

	public static void getPattern1(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i%2!=0)
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
		getPattern1(n);
		sc.close();
	}

}
