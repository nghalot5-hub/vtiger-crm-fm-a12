package patternProgramLevel1;
/*
 Enter number of rows: 
7
         
         
         
 */

import java.util.Scanner;

public class Ques226 {
	public static void printPattern(int n) {
	    int sStar = 1;
	    int eStar = 2 * n - 1;

	    for (int i = 1; i <= n; i++) {
	        for (int j = 1; j <= eStar; j++) {
	            if (j == sStar || j == (eStar - sStar + 1))
	                System.out.print("* ");
	            else
	                System.out.print("  ");
	        }
	        sStar++;
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
