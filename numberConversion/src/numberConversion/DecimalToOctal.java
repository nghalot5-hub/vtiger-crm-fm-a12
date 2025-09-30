package numberConversion;

import java.util.Scanner;

public class DecimalToOctal {
	public static String decimalToOctal(int n) {

	String result="";
	while(n>0) {
		int rem=n%8;
		result=rem+result;
		n/=8;
	}
	return result;	
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter decimal number: ");
		int n=sc.nextInt();
		String result=decimalToOctal(n);
		System.out.println("Decimal to Octal converstion is:"+result);
		sc.close();
	}
	
}
