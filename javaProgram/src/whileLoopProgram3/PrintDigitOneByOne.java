package whileLoopProgram3;
import java.util.Scanner;

public class PrintDigitOneByOne {
	public static void getPrintDigitOneByOne(int digit) {
		int rem=1;
		while(digit!=0) {
			rem=digit%10;
			System.out.println(rem);
			digit=digit/10;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter digit :");
		int digit=sc.nextInt();
		getPrintDigitOneByOne(digit);
	}
}
