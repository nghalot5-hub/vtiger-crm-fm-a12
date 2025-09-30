package whileLoopProgram3;
import java.util.Scanner;

public class PrintFactorialOfEachDigit {
	
	public static void printFactorialOfEachDigit(int num) {
		while(num>0) {
			int fact=1;
			int rem=num%10;
			fact=getFactorial(rem);
			System.out.println(rem+"! = "+fact);
			num/=10;
		}
	}
	
	private static int getFactorial(int num) {
		int fact=1,i=1;
		while(i<=num) {
			fact=fact*i;
			i++;
		}
		return fact;
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		printFactorialOfEachDigit(num);
		sc.close();
	}
	
	

}
