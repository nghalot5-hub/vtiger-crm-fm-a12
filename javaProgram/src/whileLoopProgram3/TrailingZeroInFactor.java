package whileLoopProgram3;

import java.util.Scanner;

public class TrailingZeroInFactor { //how many zero's will be yhere in factorial of a number
	public static int getTrailingZeroInFactor(int n) {
		int count=0;
		while(n>0) {
			count=count+n/5;
			n/=5;
		}
		return count;
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		System.out.println(getTrailingZeroInFactor(sc.nextInt()));
		sc.close();
	}

}
