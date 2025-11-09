package string;

import java.util.Scanner;

class CountCharacterWithoutSpaceInString{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        	System.out.print("Enter string: ");
		String s=sc.nextLine();
		int length=legthOfString(s);
		System.out.println("Length of string is: "+length);	
		sc.close();
	}

	public static int legthOfString(String s){
		int count=0;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c!=' ')			
			count++;
		}
	return count;
	}
	
}
