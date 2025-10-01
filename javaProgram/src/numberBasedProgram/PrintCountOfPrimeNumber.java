package numberBasedProgram;

import java.util.Scanner;

public class PrintCountOfPrimeNumber {
	public static void printCountOfPrimeNumber(int n) {
		int i,count1=0,j;
		for(j=1;j<=n;j++) {	
			int count=0;
			for(i=2;i<=j/2;i++) {
				if(j%i==0)
					count++;			
			}
				if(count==0) {
					System.out.println(j+" is a prime number.");

					count1++;
				}
				
				if(count1==n) {
					System.out.println(n+"th prime number is "+j);
				break;
				}

			}
		System.out.println(count1+" prime number comes in between 0 to "+n);
	}

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		printCountOfPrimeNumber(n);
		sc.close();
	}


}
