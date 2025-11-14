package string;

/*
 * i/p: old is gold
 * o/p: dlo si  dlog
 */
import java.util.Scanner;

public class ReverseLetterInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s = sc.nextLine();
		String result = printReverse(s);
		System.out.println(result);
		sc.close();
	}

	public static String printReverse(String s) {
		String word = "";
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ')
				word = c + word;
			if ((c == ' ' || i == s.length() - 1) && word.length() != 0) {
				result = result + word + " ";
				word = " ";
			}
		}
		return result.trim();
	}

}
