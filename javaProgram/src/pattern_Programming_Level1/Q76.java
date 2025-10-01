package pattern_Programming_Level1;

/*
n=5
              1
           2  3  4
        5  6  7  8  9
    10 11 12 13 14 15 16
 17 18 19 20 21 22 23 24 25
 */

import java.util.Scanner;

public class Q76 {

	public static void getPattern51(int n) {
		int space=n-1,Star=1;
		int num=Star, mid=n;
		if(n<0)
			System.out.println("Invalid number entered");
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=space;j++) {
				System.out.print("   ");
			}
			for(int j=1;j<=Star;j++) {
				if(j<mid)
				System.out.printf("%3d",num++);
				else
				System.out.printf("%3d",num--);		
				
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
