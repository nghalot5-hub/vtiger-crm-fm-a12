package string;

import java.util.Scanner;

public class LongestPalindromicString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = sc.nextLine();
		String result = getLongesstPalindromicString(s);
		System.out.println(result);
		sc.close();
	}

	public static String getLongesstPalindromicString(String s) {
		if (s == null || s.length() < 1) {
			return "";
		}
		int start = 0;
		int end = 0;
		for (int i = 0; i < s.length(); i++) {
			int len1 = expandAroundCenter(s, i, i);
			int len2 = expandAroundCenter(s, i, i + 1);
			int len = len1 > len2 ? len1 : len2;
			if (len > end - start + 1) {
				if (len % 2 == 1) {
					start = i - (len - 1) / 2;
					end = i + len / 2;
				} else {
					start = i - (len - 1) / 2;
					end = i + len / 2;
				}
			}
		}
		return s.substring(start, end + 1);
	}

	public static int expandAroundCenter(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return right - left - 1;
	}
}