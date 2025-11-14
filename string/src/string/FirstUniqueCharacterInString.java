package string;

import java.util.Scanner;

public class FirstUniqueCharacterInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=sc.nextLine();
		int result=firstUniqueCharacterInString(s);
		System.out.println(result);
		sc.close();
	}

	public static int firstUniqueCharacterInString(String s){
		int[] freq=new int[26];
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			freq[c-97]++;
		}
		for(int i=0;i<s.length();i++) {
			if(freq[s.charAt(i)-97]==1){
				return i;
			}
		}
		return -1;
	}
}
