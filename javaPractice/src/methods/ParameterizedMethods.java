package methods;

import java.util.Scanner;

public class ParameterizedMethods {
	public static void demo(int x) {
		System.out.println("The number you have entered is "+x);
	}

	public static void main(String[] args) {
		System.out.println("=====Main method starts====");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name: ");
		String name=sc.nextLine();
		ParameterizedMethods.test(name);
		System.out.print("Enter number: ");
		int x=sc.nextInt();
		ParameterizedMethods.demo(x);
		System.out.println("=====Main method stops====");
		sc.close();
	}
	
	public static void test(String name) {
			System.out.println("Test methos: "+name);
	}


}
