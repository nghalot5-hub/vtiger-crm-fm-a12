package doWhileLoop;

import java.util.Scanner;

public class EmailValidation {
	String sEmail="nidhi5@gmai.com";
	
	public static boolean isEmailValidate() {
		Scanner sc=new Scanner(System.in);
		String uEmail; int attempt=5;
		do {
			System.out.println("Enter email: ");
			uEmail=sc.nextLine();
			int atIndex=uEmail.indexOf('@'); 
			int dotIndex=uEmail.lastIndexOf('.'); 
			if(atIndex>=0 && dotIndex>=0 && dotIndex>atIndex)
				return true;
			attempt--;
			System.out.print("Wrong email You have left with "+attempt+" attempts");
		}while(attempt>0);	
		
		return false;
	}

	public static void main(String[] args) {
		if(isEmailValidate())
			System.out.println("Email validated successfully.");
		else
			System.out.println("Email not validated.");

	}

}
