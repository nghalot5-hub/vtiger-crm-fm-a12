package patternProgramLevel1;

import java.util.Scanner;

/* 
Enter number of rows: 
5
    * 
  *   * 
*       * 
 */

public class Ques223 {
	public static void printPattern(int n) {
		int sStar = n/2+1;
		int eStar=n/2+1;
		for(int i=1;i<=n;i+=2) {
			for(int j=1;j<=eStar;j++) {
				if(j==sStar || j==eStar)
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
