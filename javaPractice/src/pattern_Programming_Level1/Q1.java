package pattern_Programming_Level1;

/*
n=5
11111
22222
33333
44444
55555
 */

import java.util.Scanner;

public class Q1 {

	public static void getPattern1(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int n=sc.nextInt();
		getPattern1(n);
		sc.close();
	}

}
