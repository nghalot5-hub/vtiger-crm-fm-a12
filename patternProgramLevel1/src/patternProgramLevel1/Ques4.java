package patternProgramLevel1;
import java.util.Scanner;

/*
 Enter number of rows:
 5
 10101
 10101
 10101
 10101
 10101
 */

public class Ques4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j%2+" ");

					}
			System.out.println();
		}
	}
}