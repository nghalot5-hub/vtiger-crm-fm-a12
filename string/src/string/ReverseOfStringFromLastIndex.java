package string;

import java.util.Scanner;

class ReverseOfStringFromLastIndex{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        	System.out.print("Enter string: ");
		String s=sc.nextLine();
		String resultantString =reverseOfStringFromLastIndex(s);
		System.out.println("Output string is: "+resultantString);
		sc.close();
	}

	public static String reverseOfStringFromLastIndex(String s){
		String resultantString="";	
		for(int i=s.length()-1;i>=0;i--){
			char c=s.charAt(i);
				resultantString=resultantString+c;
		}
		return resultantString;
	}
	
} 
