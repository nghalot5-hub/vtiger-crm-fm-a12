package pattern_Programming_Level1;

/*
n=5
		      1
           3  2  1
        5  4  3  2  1
     7  6  5  4  3  2  1
  9  8  7  6  5  4  3  2  1
 */

import java.util.Scanner;

public class Q73 {

	public static void getPattern51(int n) {
		int space=n-1,Star=1;
		if(n<0)
			System.out.println("Invalid number entered");
		for(int i=1;i<=n;i++) {
			int num=Star;
			for(int j=1;j<=space;j++) {
				System.out.print("   ");
			}
			for(int j=1;j<=Star;j++) {
					System.out.printf("%3d",+num--);
				}
			Star+=2; 
			space--; 
			
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.err.println("Note: Enter Odd number of row only.");
		System.out.print("\nEnter number of rows: ");
		int n=sc.nextInt();
		getPattern51(n);
		sc.close();
	}

}
