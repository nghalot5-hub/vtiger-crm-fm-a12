package string;

import java.util.Scanner;

class PrintNumericIndexInString{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        	System.out.print("Enter string: ");
		String s=sc.nextLine();
		printNumericIndexInString(s);
		sc.close();
	}

	public static void printNumericIndexInString(String s){		
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c>='0' && c<='9' )	
			System.out.println("Index of "+c+" is: "+i);	;
		
		}
	}
	
}
