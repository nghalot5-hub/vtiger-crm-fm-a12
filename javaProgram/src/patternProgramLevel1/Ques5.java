package patternProgramLevel1;

import java.util.Scanner;

/*
 Enter number of rows:
 5
 *****
 *   *
 *	 *
 *   *
 *****

 */

public class Ques5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1 || j==n)
					System.out.print("*");
				else
					System.out.print(" ");
	

					}
			System.out.println();
		}
	}

}
