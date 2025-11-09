package string;

import java.util.Scanner;

class ReverseOfStringFrom0Index{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        	System.out.print("Enter string: ");
		String s=sc.nextLine();
		String resultantString =reverseOfStringFrom0Index(s);
		System.out.println("Output string is: "+resultantString);
		sc.close();
	}

	public static String reverseOfStringFrom0Index(String s){
		String resultantString="";	
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
				resultantString=c+resultantString;
		}
		return resultantString;
	}
	
} 
