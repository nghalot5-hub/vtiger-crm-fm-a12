package string;
import java.util.Scanner;

/*LeetCode
 * 1832. Check if the Sentence Is Pangram
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

Example 2:
Input: sentence = "leetcode"
Output: false
 */

public class CheckIfPangram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string: ");
		String s=sc.nextLine();
		System.out.println(checkIfPangram(s));
		sc.close();
	}
	
	public static boolean checkIfPangram(String sentence){
		if(sentence.length()<26)
			return false;
		int [] freq=getFrequency(sentence);
		for(int i=0;i<freq.length;i++){
			if(freq[i]==0) {
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
