package whileLoopProgram3;

import java.util.Scanner;

public class PowerOfTwo {
	public static boolean IsPowerOfTwo(int n) {
		while(n>1)
		{
			if(n%2==1)
				return false;
			n/=2;
		}
		return n==1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		if(IsPowerOfTwo(n))
			System.out.println(n+" is a power of 2");
		else
			System.out.println(n+" is not a power of 2");

		sc.close();
	}

}
