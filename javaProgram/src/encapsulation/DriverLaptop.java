package encapsulation;
import java.util.Scanner;

public class DriverLaptop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Laptop user=new Laptop();
		
		//setting values to the fields using setters
		System.out.println("Enter Laptop Name: ");
		user.setlName(sc.next());
		System.out.println("Enter Laptop Price: ");
		user.setlPrice(sc.nextInt());
		System.out.println("Enter Laptop specification: ");
		user.setlSpec(sc.next());
		System.out.println("Enter Laptop RAM: ");
		user.setlRAM(sc.nextInt());
		
		//getting values from  using getters
		System.out.println(user.getlName());
		System.out.println(user.getlPrice());
		System.out.println(user.getlSpec());
		System.out.println(user.getlRAM());
		
		sc.close();
	}
}
