package numberConversion;

import java.util.Scanner;
public class NumberConversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		do {		
		System.out.println("Press 1=>To Convert Decimal Number to Binary Number.");
		System.out.println("Press 2=>To Convert Binary Number to Decimal Number.");
		System.out.println("Press 3=>To Convert Decimal Number to Octal Number");
		System.out.println("Press 4=>To Convert Octal Number to Decimal Number.");
		System.out.println("Press 5=>To Convert Decimal Number to Hexadecimal Number.");
		System.out.println("Press 6=>To Convert Hexadecimal Number to Decimal Number.");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("You want to convert Decimal Number to Binary Number.");
			System.out.println("Enter Decimal Number:");
			int n1=sc.nextInt();				
			String result1=DecimalToBinary.decimalToBinary(n1);
			System.out.println(result1);
			break;
		case 2:
			System.out.println("You want to convert Binary Number to Decimal Number.");
			System.out.println("Enter Binary Number:");
			int n2=sc.nextInt();	
			System.out.println(BinaryToDecimal.binaryToDecimal(n2));
			break;
		case 3:
			System.out.println("You want to convert Decimal Number to Octal Number.");
			System.out.println("Enter Decimal Number:");
			int n3=sc.nextInt();	
			System.out.println(DecimalToOctal.decimalToOctal(n3));		
			break;
		case 4:
			System.out.println("You want to convert Octal Number to Decimal Number.");
			System.out.println("Enter Decimal Number:");
			int n4=sc.nextInt();	
			System.out.println(OctalToBinary.octalToBinary(n4));
			break;
		case 5:
			System.out.println("You want to convert Decimal Number to Hexadecimal Number.");
			System.out.println("Enter Decimal Number:");
			int n5=sc.nextInt();	
			System.out.println(DecimalToHexaDecimal.decimalToHexaDecimal(n5));		
			break;
		default:
			System.out.println("Invalid choice entered");
		}
		System.out.println("Press Y/y: To enter your choice again.");
		System.out.println("Press any key to exit");
		ch=sc.next().charAt(0);
	}while(ch=='y' || ch=='Y');
			System.out.println("=====Visit Again======");
			sc.close();
	}
}
