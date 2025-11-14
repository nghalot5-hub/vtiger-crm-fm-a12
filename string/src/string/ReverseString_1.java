package string;

/*
 * i/p: old is gold
 * o/p: gold  is old
 */

import java.util.Scanner;

public class ReverseString_1 {

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
				word = word + c;
			if ((c == ' ' || i == s.length() - 1) && word.length() != 0) {
				result = word + " " + result;
				word = " ";
			}
		}
		return result.trim();
	}

}
