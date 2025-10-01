package pattern_Programming_Level1;

/*
n=8
* * * * * * * * 
* * * * * * * * 
* *         * * 
* *         * * 
* *         * * 
* *         * * 
* * * * * * * * 
* * * * * * * * 
*/
import java.util.Scanner;

public class Q6 {

	public static void getPattern5(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==2||i==(n-1) || i==n || j==1||j==2 || j==(n-1)|| j==n)
					System.out.print("* "); 
				else
				    System.out.print("  ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int n = sc.nextInt();
		getPattern5(n);
		sc.close();
	}

}
