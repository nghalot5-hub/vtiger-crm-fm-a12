package array_Assignment1;

import java.util.Scanner;

public class Q11 {
	//Print sum of all elements divisible by 3.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("Enter Size of an array: ");
		int size = sc.nextInt();
		int[] num = new int[size];
		for (int i = 0; i < num.length; i++) {
			System.out.print("Enter " + (i + 1) + " element: ");
			num[i] = sc.nextInt();

		}
		System.out.println("==============================================");
		for (int j = 0; j < num.length; j++) {
			if(num[j]%3==0)
			sum = sum + num[j];
		}
	
		System.out.println("Sum of all element divisible by 3 is: " + sum);
		System.out.println("==============================================");
		sc.close();

	}

}
