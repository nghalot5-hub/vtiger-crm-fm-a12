package whileLoopProgram3;

import java.util.Scanner;

public class PalindromeNumber {
	public static boolean isPalindromeNumber(int num) {
		int rev=0, original=num, rem=0;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+(rem);
			num/=10;		
		}
		System.out.println(rev+ " is the reverse of "+original);
		return rev==original;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		if(isPalindromeNumber(num))
			System.out.println(num+" is Palindrome Number");
		else
			System.out.println(num+" is not a Palindrome Number");
		sc.close();
	}

}

