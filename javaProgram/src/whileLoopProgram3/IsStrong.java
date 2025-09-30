package whileLoopProgram3;

import java.util.Scanner;

public class IsStrong {
	
	public static boolean isStrong(int num) {
		int orignalNumber=num,sum=0;
		while(num>0) {
			sum=sum+getFactorial(num%10);
			num/=10;;
		}
		return sum==orignalNumber;
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
		if(isStrong(num))
			System.out.println(num+" is Strong Number");
		else
			System.out.println(num+" is not a Strong Number");
		sc.close();
	}

}
