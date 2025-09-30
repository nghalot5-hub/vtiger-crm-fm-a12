package whileLoopProgram3;

import java.util.Scanner;

public class GreatestDigitOfNumber {

		public static void getGreatestDigitOfNumber(long num) {
			long rem=1,greatest=0;
			while(num>0) {
				rem=num%10;
				if(rem>greatest)
					greatest=rem;
				num=num/10;
			}			
			System.out.println(greatest);

		}

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter digit :");
			int num=sc.nextInt();
			getGreatestDigitOfNumber(num);
			sc.close();
		}
	}
