package string;

import java.util.Scanner;

class SegregateAlphabetsAndNumericFromStringAndMaintainOrder{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        	System.out.print("Enter string: ");
		String s=sc.nextLine();
		String resultantString =segregateAlphabetsAndNumericFromStringAndMaintainOrder(s);
		System.out.println("Output string is: "+resultantString);
		sc.close();
	}

	public static String segregateAlphabetsAndNumericFromStringAndMaintainOrder(String s){
		String resultantString="";	
		String charString="";	
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c>='A' && c<='z' || c>='a' && c<='z' )
				charString=charString+c;
			else if(c>='0' && c<='9')
				resultantString=resultantString+c;
		}
		return charString+resultantString;
	}
	
} 
