package numberConversion;

import java.util.Scanner;

public class DecimalToHexaDecimal {
	
	public static String decimalToHexaDecimal(int n) {
		String hex="";
		while(n>0) {
			int rem=n%16;
			if(rem<=9)
				return hex=rem+hex;
			else 
			hex=(char)(rem+55)+hex;
			n/=16;
		}
		return hex;	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter decimal number: ");
		int n=sc.nextInt();
		String hex=decimalToHexaDecimal(n);
		System.out.println("Decimal to hexadecimal converstion is:"+hex);
		sc.close();
	}
}
