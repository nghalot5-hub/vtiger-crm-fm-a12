package vehicleProject;
import java.util.Scanner;

public class Travel {
	Scanner sc=new Scanner(System.in);
	
	public Vehicle selectVehicle() {
		
		System.out.println("Press 1: Two Wheeler \nPress 2: Four Wheeler" );
		System.out.println("--------------------------------------------------------");
		int choice=sc.nextInt();
		System.out.println("You have selected " +choice);
		if(choice==1) {
			return selectTwoWheeler();
		}
		else if(choice==2) {
			return selectFourWheeler();
		}
		else {
			System.out.println("You have entered INVALID choice, Please select again");
			return selectVehicle();
		}
			
	}
	
		
	
	public Vehicle selectTwoWheeler() {
		System.out.println("Press 1: Bike \nPress 2: Scooty \nPress 3: Cycle " );
		System.out.println("--------------------------------------------------------");
		int choice=sc.nextInt();
		System.out.println("You have selected " +choice);
		if(choice==1) {
			Bike b=new Bike();
			return b;
		}
		else if(choice==2) {
			Scooty s=new Scooty();
			return s;
		}
		else if(choice==3) {
			Cycle c=new Cycle();
			return c;
		}else {
			System.out.println("You have entered INVALID choice, Please select again");
			return selectTwoWheeler();
		}
	}
	
	public Vehicle selectFourWheeler() {
		System.out.println("Press 1: Car \nPress 2: Bus \nPress 3: Jeep " );
		System.out.println("--------------------------------------------------------");
		int choice=sc.nextInt();
		System.out.println("You have selected " +choice);
		if(choice==1) {
			Car c1=new Car();
			return c1;
		}
		else if(choice==2) {
			Bus b1=new Bus();
			return b1;
		}
		else if(choice==3) {
			Jeep j=new Jeep();
			return j;
		}else {
			System.out.println("You have entered INVALID choice, Please select again");
			return selectFourWheeler();
		}
	}

}
