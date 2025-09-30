package whileLoopProgram3;
import java.util.Scanner;

public class PrintLeftToRight {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter digit :");
		int n=sc.nextInt();
		PrintDigitFromLeftToRight(n);
		sc.close();
		}

	public static int getCount(int n) {
		int count=0;
		while(n>0) {
			count++;
			n/=10;
			}
		return count;
		}
	
	public static int getPower(int a, int b) {
		int pow=1,i=1;
		while(i<=b) {
			pow=pow*a;
			i++;
		}
		return pow;
	}
	
	
	public static void PrintDigitFromLeftToRight(int n) {
	int num=n, digit=getCount(n);
		while(num>0) {
			int digitValue=(n/(getPower(10,digit-1)))%10;
			System.out.println(digitValue);
			digit--;
			num/=10;;
		}
	}
}