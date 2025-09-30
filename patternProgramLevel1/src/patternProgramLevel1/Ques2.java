package patternProgramLevel1;

import java.util.Scanner;

/*
 Enter number of rows:
 5
 11111
 00000
 11111
 00000
 11111
 */

public class Ques2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i%2==0)
				System.out.print("0");
				else
				System.out.print("1");
	
			}
			System.out.println();
		}
	}

}
