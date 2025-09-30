package whileLoopProgram3;

import java.util.Scanner;

public class PrintDigitGreaterThan5 {

	public static void getPrintDigitGreaterThan5(long num) {
		long rem=1;
		while(num>0) {
			rem=num%10;
			if(rem>=5)
				System.out.println(rem);
			num=num/10;
		}			
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter digit :");
		int num=sc.nextInt();
		getPrintDigitGreaterThan5(num);
		sc.close();
	}
}
