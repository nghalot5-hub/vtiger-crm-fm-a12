package patternProgramLevel1;
/*
 1
 3		2
 6		5		4
 10		9		8		7
 15		14		13		12		11
 */

import java.util.Scanner;

public class Ques24 {

		public static void printPattern(int n) {
			int start=1;
		for(int i=1;i<=n;i++) {
			int num=i*(i+1)/2;
			for (int j=1;j<=num-i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		}
	

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number of rows: ");
			int n=sc.nextInt();
			printPattern(n);
			sc.close();
		}
}
