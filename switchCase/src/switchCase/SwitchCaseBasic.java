package switchCase;

import java.util.Scanner;

public class SwitchCaseBasic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char ch;
		do {
			System.out.println("Enter a value: ");
			int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Case-1");
			break;
		case 2:
			System.out.println("Case-2");
			break;
		case 3:
			System.out.println("Case-3");
			break;
		case 4:
			System.out.println("Case-4");
			break;
		default:
			System.out.println("Invalid Choice");		
		}
	
		 System.out.println("Enter y/Y: If you want to continue. \nEnter any key to exit.");
		 ch=sc.next().charAt(0);

		}while(ch=='y' || ch=='Y');
		System.out.println("====Visit Again=====");
	}
}
