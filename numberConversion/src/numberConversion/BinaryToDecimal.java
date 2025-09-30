package numberConversion;

import java.util.Scanner;

class BinaryToDecimal {

	public static String binaryToDecimal(int n) {
		int result=0,twosMultiple=1;
		while(n>0) {
			int rem=n%10;
			if(rem>1)
				return "Invalid Value Entered, Binary range is 0 or 1"+rem;
			result=result+rem*twosMultiple;
			n/=10;
			twosMultiple*=2;
		}
		
		return "Binary to Decimal converstion is:"+result;	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Binary number: ");
		int n=sc.nextInt();
		System.out.println(binaryToDecimal(n));
		sc.close();
	}
}
