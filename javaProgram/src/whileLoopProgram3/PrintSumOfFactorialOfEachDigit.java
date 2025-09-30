package whileLoopProgram3;

import java.util.Scanner;

public class PrintSumOfFactorialOfEachDigit {
	
	public static void printSumOfFactorialOfEachDigit(int num) {
		int sum=0;
		while(num>0) {
			int fact=1;
			int rem=num%10;
			fact=getFactorial(rem);
			sum=sum+fact;
			num/=10;
		}
		System.out.println("Sum of factorial of each digit is "+sum);

	}

	private static int getFactorial(int num) {
		int fact=1,i=1;
		while(i<=num) {
			fact=fact*i;
			i++;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		printSumOfFactorialOfEachDigit(num);
		sc.close();
		
	}

}
