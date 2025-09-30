package vendingMachine;
import java.util.Scanner;

public class VendingMachine {
	Scanner sc=new Scanner(System.in);
	
	public Beverage selectBeverage() {
		System.out.println("Press 1: Coffee  \nPress 2: Juice \nPress 3: Coke \nPress 4: Wine");
		System.out.println("-------------------------------------------------------------------");
		int choice=sc.nextInt();
		System.out.println("You have selected " +choice);
	switch(choice) {
	case 1: Coffee co=new Coffee();
			return co;
	case 2: Juice ju=new Juice();
			return ju;
	case 3: Coke c=new Coke();
		    return c;
	case 4: Wine wi=new Wine();
			return wi;
	default: System.out.println("Invalid Choice, select again");
			return selectBeverage();
		}
	}
}
