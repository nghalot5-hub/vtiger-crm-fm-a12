package whileLoopProgram3;

import java.util.Scanner;

public class IsPalindromeString {

	public static boolean isPalindromeString(String n) {
		int start=0, end=n.length()-1;
		while(start<end) {
			if(n.charAt(start)!=n.charAt(end))
				return false;
			start++;  end--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter word: ");
		String n=sc.next();
		if(isPalindromeString(n))
			System.out.println("Yes, "+n+" is Palindrome");
		else
			System.out.println("No, "+n+" is not Palindrome");
	sc.close();
	}

}
