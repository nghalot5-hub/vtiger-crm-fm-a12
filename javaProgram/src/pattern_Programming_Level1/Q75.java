package pattern_Programming_Level1;

/*
n=5
             25
          24 23 22
       21 20 19 18 17
    16 15 14 13 12 11 10
  9  8  7  6  5  4  3  2  1
 */

import java.util.Scanner;

public class Q75 {

	public static void getPattern51(int n) {
		int space=n-1,Star=1;
		int num=n*n;
		if(n<0)
			System.out.println("Invalid number entered");
		for(int i=1;i<=n;i++) {
			
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
