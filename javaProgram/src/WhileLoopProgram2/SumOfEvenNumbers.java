package WhileLoopProgram2;
import java.util.Scanner;

public class SumOfEvenNumbers {
	public static int getSumOfEvenNumber100(int n) {
		int i=1, sum=0;
		while(i<=n) {
			if(i%2==0) {
			sum+=i;
			}
			i++;
				}
		System.out.println("=====Method======");
		System.out.println("Sum of 100 even number is "+sum);
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		int n=sc.nextInt();
			int sum=getSumOfEvenNumber100(n);
			System.out.println("=====Main Method=======");
			System.out.println("Sum of 100 even number is "+sum);

	}

}
