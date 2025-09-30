package whileLoopProgram3;

import java.util.Scanner;

public class NumberOf1BinaryBits {
	public static int getNumberOf1BinaryBits(int n) {
		int bit1=0;
		while(n>0) {
			if(n%2==1)
				bit1++;
		n/=2;
		}
		return bit1;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		System.out.println(n+ " conaitns " +getNumberOf1BinaryBits(n)+ " 1binary bits.");
		sc.close();
	}

}
