package array_Assignment1;

import java.util.Scanner;

public class Q10 {
	//Print sum of all odd elements from array

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
			if(num[j]%2==1)
			sum = sum + num[j];
		}
	
		System.out.println("Sum of all odd element is: " + sum);
		System.out.println("==============================================");
		sc.close();

	}

}
