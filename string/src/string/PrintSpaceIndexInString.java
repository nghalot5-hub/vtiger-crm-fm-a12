package string;

import java.util.Scanner;

class PrintSpaceIndexInString{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        	System.out.print("Enter string: ");
		String s=sc.nextLine();
		printSpaceIndexInString(s);
		sc.close();
	}

	public static void printSpaceIndexInString(String s){		
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c==' ' )	
			System.out.println("Index of space is: "+i);	;
		}
	}
	
} 
