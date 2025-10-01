package numberBasedProgram;

import java.util.Scanner;

public class IsPrimeNmber {
	public static boolean isPrimeNmber(int n) {
		int i,count=0;
		if(n<2)
			return false;
		for(i=2;i<=n/2;i++) {
			if(n%i==0)
			count++;			
		}
		if(count==0)
			return true;
		
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		if(isPrimeNmber(n))
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");		
		sc.close();
	}

}
