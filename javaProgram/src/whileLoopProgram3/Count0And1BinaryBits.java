package whileLoopProgram3;

import java.util.Scanner;

public class Count0And1BinaryBits {
	public static void getCount0And1BinaryBits(int n) {
		int bit1=0,bit0=0,num=n;
		while(n>0) {
			int rem=n%2;
			System.out.print(rem);
			if(rem==1)
				bit1++;
			else
				bit0++; 
			n/=2;
			}
		System.out.println("\n"+num+ " conaitns " +bit1+ " 1binary bits.");
		System.out.println(num+ " conaitns " +bit0+ " 0binary bits.");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		getCount0And1BinaryBits(n);
		sc.close();
	}

}
