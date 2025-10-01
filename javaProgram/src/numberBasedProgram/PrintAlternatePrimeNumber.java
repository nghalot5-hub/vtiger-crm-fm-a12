package numberBasedProgram;

import java.util.Scanner;

public class PrintAlternatePrimeNumber {
	public static void printAlternatePrimeNumber(int n) {
		int i,count1=0,j;
		for(j=1;j<=n;j++) {	
			int count=0;
			for(i=2;i<=j/2;i++) {
				if(j%i==0)
					count++;			
			}

				if(count==0) {
					count1++;		
						if(count1%2!=0) {
						//	System.out.println(j+" is a prime number.");
							System.out.print(j+ "\t");
						}
				}

			}
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter range: ");
		int n=sc.nextInt();
		
		printAlternatePrimeNumber(n);
		sc.close();
	}

	}
