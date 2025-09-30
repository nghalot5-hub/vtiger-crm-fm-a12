package pattern_Programming_Level1;

/*
n=5
1  
2  3  
4  5  6  
7  8  9  10 
11 12 13 14 15 
*/
import java.util.Scanner;

public class Q23 {

	public static void getPattern6(int n) {
		
		int star=1;
		if(n<0 || n%2==0 )
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
					System.out.printf("%-3d",star++ );
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
