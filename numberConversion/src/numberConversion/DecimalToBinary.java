package numberConversion;

import java.util.Scanner;

public class DecimalToBinary {
	
	public static String decimalToBinary(int n) {
		String result="";
		while(n>0) {
			int rem=n%2;
			result=rem+result;
			n/=2;
		}
		return result;	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter decimal number: ");
		int n=sc.nextInt();
		String result=decimalToBinary(n);
		System.out.println("Decimal to Binary converstion is:"+result);
		sc.close();
	}

}
