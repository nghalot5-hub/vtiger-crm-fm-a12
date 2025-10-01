package array_Assignment1;

import java.util.Scanner;

public class Q7 {
	//WAJP to print and count all the elements of array which are bigger than average value.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, avg=0;
		System.out.print("Enter Size of an array: ");
		int size = sc.nextInt();
		int[] num = new int[size];
		for (int i = 0; i < num.length; i++) {
			System.out.print("Enter " + (i + 1) + " element: ");
			num[i] = sc.nextInt();

		}
		System.out.println("==============================================");
		for (int j = 0; j < num.length; j++) {
			sum = sum + num[j];
		}
		
		System.out.println("==============================================");
		System.out.println("Sum of all element is: " + sum);
		avg=sum/num.length;
		System.out.println("Average of all element is: " + avg);
		System.out.println("==============================================");
		
		sc.close();

	}

}
