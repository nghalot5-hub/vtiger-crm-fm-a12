package numberBasedProgram;

import java.util.Scanner;

public class IsPalindrome {
	
	public static String isPalindrome(int digit) {
		int rev=1,n=digit;
		while(digit>0) {
			rev=digit%10;
			digit/=10;
			System.out.print(rev);
			
		}	
				return rev==n? "is palindrome" : "is not palindrome";
	}		

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter digit");
		int digit=sc.nextInt();
		System.out.println(isPalindrome(digit));

	}

}
