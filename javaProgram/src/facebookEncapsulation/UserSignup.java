package facebookEncapsulation;
import java.util.Scanner;

public class UserSignup {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Full Name: ");
		String fullName=sc.next();
		System.out.println("\nEnter email id: ");
		String email=sc.next();
		System.out.println("Enter mobile number: ");
		String mobileNumber=sc.next();
		System.out.println("Enter password: ");
		String password=sc.next();
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		
		SignUp user=new SignUp();
		
		//calling setters
	
		user.setFullName(fullName);
		user.setEmail(email);
		user.setMobileNumber(mobileNumber);
		user.setPassword(password);
		user.setAge(age);
		
		//calling getters
		System.out.println("Signup Successful!");
        System.out.println("Name: " + user.getFullName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Mobile: " + user.getMobileNumber());
        System.out.println("Password: " + user.getPassword());
        System.out.println("Age: " + user.getAge());
		
		sc.close();
	}

}
