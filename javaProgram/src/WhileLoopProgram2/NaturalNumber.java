package WhileLoopProgram2;

import java.util.Scanner;
public class NaturalNumber {
	public static int getSumOfNaturalNumber100(int n) {
		int i=1, sum=0;
		while(i<=n) {
			sum+=i;
			i++;
				}
		System.out.println("=====Method======");
		System.out.println("Sum of 100 natural number is "+sum);
		return sum;
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number ");
	int n=sc.nextInt();
		int sum=getSumOfNaturalNumber100(n);
		System.out.println("=====Main Method=======");
		System.out.println("Sum of 100 natural number is "+sum);
		

	}

}
