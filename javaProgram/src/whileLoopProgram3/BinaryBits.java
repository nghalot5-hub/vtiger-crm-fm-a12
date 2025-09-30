package whileLoopProgram3;
import java.util.Scanner;

public class BinaryBits {
	
	public static int getBinaryBits(int n) {
		int count=0;
		while(n>0) {
			count++;
			n/=2;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		System.out.println(n+ " conaitns " +getBinaryBits(n)+ " binary bits.");

	}

}
