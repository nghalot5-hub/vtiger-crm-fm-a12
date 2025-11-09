package string;

import java.util.Scanner;

class CountVowels{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        	System.out.print("Enter string: ");
		String s=sc.nextLine();
		countVowels(s);
		sc.close();
	}

	public static void countVowels(String s){
		int countVowels=0;
		
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c>='A' && c<='Z' )	
				c=(char)(c+32);
			if(c=='a' || c=='e' || c=='i' ||c=='o' || c=='u')
				countVowels++;
			}
		System.out.println("Vowel Count is: "+countVowels);
	}
	
}
