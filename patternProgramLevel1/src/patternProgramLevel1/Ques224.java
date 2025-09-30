package patternProgramLevel1;
/*
Enter number of rows: 
4
      * 
    *   * 
  *       * 
* * * * * * * 
 */

import java.util.Scanner;

public class Ques224 {
	public static void printPattern(int n) {
		int sStar = n;
		int eStar=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=eStar;j++) {
				if(j==sStar || j==eStar || i==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			eStar++;
			sStar--;
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
