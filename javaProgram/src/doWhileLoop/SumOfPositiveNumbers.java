package doWhileLoop;

import java.util.Scanner;

public class SumOfPositiveNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0, sum=0;
		do {
			sum=sum+n;
			System.out.println("Enter Number: ");
			n=sc.nextInt();
			}while(n>0);
		System.out.println("SUm of positive numbers you have enetered "+sum);
		System.out.println("Good Bye ji");
	}
}
