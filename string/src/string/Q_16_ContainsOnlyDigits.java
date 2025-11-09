//WAJP to check if a string contains only digits
package string;

import java.util.Scanner;

public class Q_16_ContainsOnlyDigits {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter string: ");
	String s=sc.nextLine();
	if(isStringContainsOnlyDigits(s))
		System.out.println(s+ " contains only digit");
	else
		System.out.println(s+ " contains other than digit");
	sc.close();
	}
	public static boolean isStringContainsOnlyDigits(String s){
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c<'0' || c>'9')
				return false;
		}
		return true;	
	}

}
