package string;

import java.util.Scanner;

class IsStringPalindrome{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        	System.out.print("Enter string: ");
		String s=sc.nextLine();
		if(isStringPalindrome(s))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");
		sc.close();
	}


	public static boolean isStringPalindrome(String s){
		String resultantString="";	
		for(int i=s.length()-1;i>=0;i--){
			char c=s.charAt(i);
				resultantString=resultantString+c;
		}
		return resultantString.equalsIgnoreCase(s);
	}
	
} 
