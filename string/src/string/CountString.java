package string;

import java.util.Scanner;

class CountString{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        	System.out.print("Enter string: ");
		String s=sc.nextLine();
		legthOfString(s);
		sc.close();
	}

	public static void legthOfString(String s){
		int upperCaseCount=0;
		int lowerCaseCount=0;
		int spaceCount=0;
		int numericCount=0;
		int specialCharacterCount=0;

		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c>='A' && c<='Z' )	
				upperCaseCount++;
			else if(c>='a' && c<='z')
				lowerCaseCount++;	
			else if(c>='0' && c<='9' )
				numericCount++;
			else if(c==' ')
				spaceCount++;
			else
				specialCharacterCount++;
		}
		System.out.println("Upper Case Count is: "+upperCaseCount); 
		System.out.println("Lower Case Count is: "+lowerCaseCount); 
		System.out.println("Numeric Count is: "+numericCount); 
		System.out.println("Space Count is: "+spaceCount); 
		System.out.println("Special Character Count is: "+specialCharacterCount); 


	}
	
}
