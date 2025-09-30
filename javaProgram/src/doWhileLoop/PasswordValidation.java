package doWhileLoop;

import java.util.Scanner;

public class PasswordValidation {
	private static String sPwd="Sn123@";
	
	public static boolean isValidated() {
		Scanner sc=new Scanner(System.in);
		String uPwd; int attempt=3;
		do {
			System.out.println("Enter password: ");
			uPwd=sc.nextLine();
			if(uPwd.equals(sPwd)) 
				return true;
				attempt--;
				System.out.println("Incorrect Password");
				System.out.println(attempt+" Attempts remains");
		}	while(attempt>0);
		return false;
	}

	public static void main(String[] args) {
		if(isValidated())
			System.out.println("logged in successfully");
		else		
			System.out.println("Maximum attempts done, account locked");		
	}
}
