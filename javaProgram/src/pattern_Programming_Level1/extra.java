package pattern_Programming_Level1;

import java.util.Scanner;

public class extra{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of Rows: ");	
			int n=sc.nextInt();
			printPattern(n);
		}
		public static void printPattern(int n){
			int star=1;	int space=n-1;	int num=1;
			for(int i=1;i<=n;i++){
				for(int j=1;j<=space;j++)
					System.out.print("\t");

				for(int j=1;j<=star;j++)
					System.out.print(num++ +"\t");
			star+=2;		space--;
			System.out.println();
			}
		}
	
}
