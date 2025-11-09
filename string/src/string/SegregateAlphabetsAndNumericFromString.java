package string;

import java.util.Scanner;

class SegregateAlphabetsAndNumericFromString{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        	System.out.print("Enter string: ");
		String s=sc.nextLine();
		String resultantString =segregateAlphabetsAndNumericFromString(s);
		System.out.println("Output string is: "+resultantString);
		sc.close();
	}

	public static String segregateAlphabetsAndNumericFromString(String s){
		String resultantString="";	
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c>='A' && c<='z' || c>='a' && c<='z' )
				resultantString=c+resultantString;
			else if(c>='0' && c<='9')
				resultantString=resultantString+c;
		}
		return resultantString;
	}
	
} 
