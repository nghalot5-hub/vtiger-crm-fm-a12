package string;

import java.util.Scanner;
class FirstPalindromeString{
	public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
        		System.out.print("Enter number of string: ");
			int size=sc.nextInt();
			sc.nextLine();
			String[] words=new String[size];
			for(int i=0; i<words.length; i++){
				System.out.print("Enter the word "+(i+1)+": ");
				words[i]=sc.nextLine();				
			}
			String reult=firstPalindrome(words);
			System.out.println(reult);	
			sc.close();
	}
		
	public static String firstPalindrome(String[] words){
		for(String s:words){
			if(isPalindrome(s))
				return s;
		}
	return "";
	}

	public static boolean isPalindrome(String s){
			StringBuilder sb = new StringBuilder(s);
			return sb.reverse().toString().equalsIgnoreCase(s);
	}
} 
