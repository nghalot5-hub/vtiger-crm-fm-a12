package string;

import java.util.Scanner;

class IsStringPalindromeUsingReverseMethod{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        	System.out.print("Enter string: ");
		String originalString=sc.nextLine();
		
		// Create a StringBuilder object with the original string
      		 StringBuilder stringBuilder = new StringBuilder(originalString);
		
		// Reverse the StringBuilder
       		 stringBuilder.reverse();
			
		// Convert the reversed StringBuilder back to a String
        	String reversedString = stringBuilder.toString();
	
		 System.out.println("Original String: " + originalString);
       		 System.out.println("Reversed String: " + reversedString);
       		sc.close();
	}
} 
