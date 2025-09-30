package whileLoopProgram3;
import java.util.Scanner;

public class DifferenceOfSmallestAndBiggest {

			public static void getDifferenceOfSmallestAndBiggest(long num) {
				long rem=1,greatest=0,smallest=9,diff=0;
				while(num>0) {
					rem=num%10;
					if(rem>greatest)
						greatest=rem;
					else if(rem<smallest)
						smallest=rem;
					num=num/10;
				}		
				diff=greatest-smallest;
				System.out.println("Greatest number of digit is :"+greatest);
				System.out.println("Smallest number of digit is :"+smallest);
				System.out.println("Difference between "+greatest+ " and " +smallest+ " is :"+diff);
			}

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter digit :");
				int num=sc.nextInt();
				getDifferenceOfSmallestAndBiggest(num);
				sc.close();
			}
}
