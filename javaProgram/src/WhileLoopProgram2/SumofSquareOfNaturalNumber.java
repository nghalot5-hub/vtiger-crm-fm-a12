package WhileLoopProgram2;
import java.util.Scanner;

public class SumofSquareOfNaturalNumber {
	
	public static int getSumofSquareOfNaturalNumber(int n) {
		int i=1, sum=0;
		while(i<=n) {
			sum+=i*i;
			i++;
				}
		System.out.println("=====Method======");
		System.out.println("Sum of 100 natural number is "+sum);
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int sum=getSumofSquareOfNaturalNumber(n);
		System.out.println("=====Main Method=======");
		System.out.println("Sum of 100 natural number is "+sum);
	}

}
