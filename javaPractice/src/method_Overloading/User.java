package method_Overloading;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a=sc.nextInt();
		System.out.print("Enter second number: ");
		int b=sc.nextInt();
		System.out.print("Enter first double number: ");
		double x=sc.nextDouble();
		System.out.print("Enter second double number: ");
		double y=sc.nextDouble();
		Calculator c1=new Calculator();
		c1.add(a,b);
		c1.add(y,b);
		c1.add(x,y);
		c1.add(a,x);
		c1.add(b,y);
		sc.close();
	}
	

}
