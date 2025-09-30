package pattern_Programming_Level1;

/*
n=7
            7 
          6 6 6 
        5 5 5 5 5 
      4 4 4 4 4 4 4 
    3 3 3 3 3 3 3 3 3 
  2 2 2 2 2 2 2 2 2 2 2 
1 1 1 1 1 1 1 1 1 1 1 1 1
 */

import java.util.Scanner;

public class Q70 {

	public static void getPattern51(int n) {
		int space=n-1,Star=1, num=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=Star;j++) {
					System.out.print(num+" ");
				}
			Star+=2; 
			num--;
			space--; 
			
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
