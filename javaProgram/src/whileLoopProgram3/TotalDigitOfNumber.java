package whileLoopProgram3;

import java.util.Scanner;

public class TotalDigitOfNumber {
	public static void getTotalDigitOfNumber(int digit) {
		int count=0;
		while(digit>0) {
			count++;
			digit/=10;
		}
		System.out.println("Total digit of number is :" +count);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter digit :");
		int digit=sc.nextInt();
		getTotalDigitOfNumber(digit);
		sc.close();

	}

}
