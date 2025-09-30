package whileLoopProgram3;

import java.util.Scanner;

public class PrintEvenDigitOfNumber {
	public static void getPrintEvenDigitOfNumber(long num) {
		long rem=1;
		while(num>0) {
			rem=num%10;
			if(rem%2==0)
			System.out.println(rem);
			num=num/10;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter digit :");
		int num=sc.nextInt();
		getPrintEvenDigitOfNumber(num);
		sc.close();
	}

}
