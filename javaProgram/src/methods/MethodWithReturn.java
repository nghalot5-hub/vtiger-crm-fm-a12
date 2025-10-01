package methods;

import java.util.Scanner;

public class MethodWithReturn {
	public static String checkNumber(int n) {
		if(n%2==0)
			return n+ ": is even number";
		else
			return n+ ": is od number";	
	}

	public static void main(String[] args) {
		System.out.println("====Main method starts====");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		System.out.println(checkNumber(n));
	//	System.out.println(demo());  void method can not be writen in println
		demo();
		System.out.println("====Main method stops====");
		sc.close();

	}
	
	public static void demo() {
		System.out.println("Demo method");
		return;
	}

}
