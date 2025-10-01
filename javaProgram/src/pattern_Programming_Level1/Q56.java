package pattern_Programming_Level1;

/*
n=5
            1   
          2   3   
        3   4   5   
      4   5   6   7   
    5   6   7   8   9   
  6   7   8   9   10  11  
7   8   9   10  11  12  13  
 */

import java.util.Scanner;

public class Q56 {

	public static void getPattern51(int n) {
		int space=n-1,Star=1;
		for(int i=1;i<=n;i++) {
			int num=Star;
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=Star;j++) {
				System.out.printf("%-4d",num++ );
				}
			Star++; 
			space--; 
			num++;
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int n=sc.nextInt();
		getPattern51(n);
		sc.close();
	}

}
