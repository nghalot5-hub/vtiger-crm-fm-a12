package pattern_Programming_Level1;
/*
 *n=5
    A
   BA
  CBA
 DCBA
EDCBA
 */

import java.util.Scanner;

public class Q48 {
	public static void getPattern43(int n) {
		int space=n-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=i;k>0;k--) {
				System.out.print((char)(k+64));
			}
			space--;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int n=sc.nextInt();
		getPattern43(n);
		sc.close();
	}

}
