package pattern_Programming_Level1;

/*
n=5
*       * 
  *   *   
    *     
  *   *   
*       * 
*/
import java.util.Scanner;

public class Q7 {

	public static void getPattern6(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j || i+j==n+1)
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
		getPattern6(n);
		sc.close();
	}

}
