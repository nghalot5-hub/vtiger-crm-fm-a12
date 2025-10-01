package numberConversion;

import java.util.Scanner;

public class OctalToBinary {
	public static String octalToBinary(int n) {
		int result=0,eightsMultiple=1;
		while(n>0) {
			int rem=n%10;
			if(rem>7)
				return "Invalid Value Entered, Octal range is 0 or 7"+rem;
			result=result+rem*eightsMultiple;
			n/=10;
			eightsMultiple*=8;
		}
		
		return "Octal to Binary converstion is:"+result;	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Octal number: ");
		int n=sc.nextInt();
		System.out.println(octalToBinary(n));
		sc.close();
	}
}
