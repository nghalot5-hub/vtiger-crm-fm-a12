package numberBasedProgram;

import java.util.Scanner;

public class IsPerfectNumber {
	public static boolean isPerfectNumber(int n) {
		
		int sum=1,i;
		for(i=1;i*i<=n;i++) { 
			int fact1=i;
			int fact2=n/i;
			if(fact1!=fact2)
				sum=sum+fact1+fact2;
			else
				sum=fact1+sum;
		}
		return sum==n;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		if(isPerfectNumber(n))
			System.out.println(n+" is a perfect number");
		else
			System.out.println(n+" is not a perfect number");		
		sc.close();
	}

}
