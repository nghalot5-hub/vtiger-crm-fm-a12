package customException_1;
import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age: "); 	int age = sc.nextInt();
		try {
			Register.checkEligibilty(age);
		} catch (UnderAgeException e) {
			System.err.println(e.getMessage());
		}System.out.println("Main Ends");
		sc.close();
	}
}
