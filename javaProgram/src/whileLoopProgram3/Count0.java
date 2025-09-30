package whileLoopProgram3;

import java.util.Scanner;

public class Count0 {
	public static void getCount0(long digit) {
		long rem=1,count=0;
		while(digit>0) {
			rem=digit%10;
			if(rem==0)
				count++;
			digit=digit/10;
		}			
		System.out.println("Number of 0's in digit are :" +count);

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter digit :");
		int digit=sc.nextInt();
		getCount0(digit);
		sc.close();
	}
}

