package doWhileLoop;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int a, b,ch;
		do {
			System.out.println("Enter number: ");
			a=sc.nextInt();
			System.out.println("Enter 2 number: ");
			b=sc.nextInt();
			int i=1,pow=1;
			while(i<=b) {
				pow=pow*a;
				i++;
			}
				System.out.println(a+" power "+b+ " is " +pow);
				System.out.println("Press Y/y to continue or any other key to exit.");
				ch=sc.next().charAt(0);
			}while((ch=='y' || ch=='Y'));				
		System.out.println("Thanks for coming");
		sc.close();
	}

}
