package Assignment;

import java.util.Scanner;

public class PrintNthPrimeNumber {
	public static void printNthPrimeNumber(int nth, int n) {
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
			
			if(count1==nth) {
				System.out.println(nth+"th prime number is "+j);
			break;
			}

		}
	System.out.println(count1+" prime number comes in between 0 to "+n);
}

public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number: ");
	int n=sc.nextInt();
	System.out.print("Enter nth term: ");
	int nth=sc.nextInt();
	printNthPrimeNumber(nth, n);
	sc.close();
}

}
