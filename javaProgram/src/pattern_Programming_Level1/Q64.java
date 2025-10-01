package pattern_Programming_Level1;

/*
n=5
        A    
      B    A    
    C    B    A    
  D    C    B    A    
E    D    C    B    A 

 */

import java.util.Scanner;

public class Q64 {

	public static void getPattern51(int n) {
		int space=n-1,Star=1;
		for(int i=1;i<=n;i++) {
			int num=Star;
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=Star;j++) {
				System.out.print((char)(num+64)+"    ");
				num--;
				}
			Star++ ;
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
