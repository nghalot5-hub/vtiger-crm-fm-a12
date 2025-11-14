package string;
import java.util.Scanner;

/*LeetCode
242. Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
 */

public class CheckIfAnagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String s=sc.nextLine();
		System.out.print("Enter string 2: ");
		String t=sc.nextLine();
		System.out.println(checkIfAnagram(s, t));
		sc.close();
	}
	
	public static boolean checkIfAnagram(String s, String t){
		if(s.length()!=t.length())
			return false;
		int [] freq1=getFrequency(s);
		int [] freq2=getFrequency(t);
		for(int i=0;i<freq1.length;i++){
			if(freq1[i]!=freq2[i]) {
			return false;
			}
		}
		return true;
	}

	public static int[] getFrequency(String s){
		int[] freq=new int[26];
		for(char c:s.toCharArray()){
			if(c>=65 && c<=90)
				freq[c-65]++;
			else if( c>=97 && c<=122)
				freq[c-97]++;
		}
		return freq;
	}

}
