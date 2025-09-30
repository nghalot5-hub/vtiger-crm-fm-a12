package doWhileLoop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		do {
				System.out.println("Enter Number: ");
				int n=sc.nextInt();
				System.out.println(n+"! is "+getfactorial(n));	
				System.out.println("Press Y/y to continue or any other key to exit.");
				ch=sc.next().charAt(0);
			}while((ch=='y' || ch=='Y'));
		System.out.println("Thanks for coming");		
	}
		public static double getfactorial(int n) {
		long fact=1L; int i=1;
			while(i<=n) {
				fact=fact*i;
			i++;
			}
			return fact;
		}
}
