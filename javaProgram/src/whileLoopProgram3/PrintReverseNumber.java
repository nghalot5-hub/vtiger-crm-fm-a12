package whileLoopProgram3;

import java.util.Scanner;

public class PrintReverseNumber {
	public static void printReverseNumber(int num) {
		int rev=0, n=num;
		while(num>=0) {
			rev=rev*10+(num%10);
			num/=10;		
		}
		System.out.print(rev+ " is the reverse of "+n);

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		printReverseNumber(num);
		sc.close();
	}

}
