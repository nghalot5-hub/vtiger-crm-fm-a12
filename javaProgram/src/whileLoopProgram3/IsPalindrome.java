package whileLoopProgram3;

import java.util.Scanner;

public class IsPalindrome {

	public static boolean isPalindrome(int n) {
		String s=n+"";
		int start=0, end=s.length()-1;
		while(start<end) {
			if(s.charAt(start)!=s.charAt(end))
				return false;
			start++;  end--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		if(isPalindrome(n))
			System.out.println("Yes, "+n+" is Palindrome");
		else
			System.out.println("No, "+n+" is not Palindrome");
	sc.close();
	}

}
