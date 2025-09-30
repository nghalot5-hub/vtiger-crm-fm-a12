package pattern_Programming_Level1;

/*
n=5

  
*/
import java.util.Scanner;

public class Q25 {

	public static void getPattern6(int n) {
		int star = 1, num=1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= star; j++) {
				if(i%2==0)
					System.out.printf("%-3d",num--);
				else
					System.out.printf("%-3d",num++);
			}
			if(i%2==1)
				num+=i;
			else
				num+=i+1;
			star++;
			System.out.println(" ");
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
