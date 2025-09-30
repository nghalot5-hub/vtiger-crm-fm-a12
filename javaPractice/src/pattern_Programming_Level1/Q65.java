package pattern_Programming_Level1;

/*
n=5
    A  
   B  C  
  C  D  E  
 D  E  F  G  
E  F  G  H  I  
 
 */

import java.util.Scanner;

public class Q65 {

	public static void getPattern51(int n) {
		int space=n-1,Star=1;
		for(int i=1;i<=n;i++) {
			int num=Star;
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=Star;j++) {
				System.out.printf((char)(num+64)+"  " );
				num++;
				}
			Star++; 
			num++;
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
