package dominoProject;
import java.util.Scanner;

public class Margeherita extends VegPizza {
	Scanner sc=new Scanner(System.in);
	
	Margeherita(){
	}
	
	public void placeOrder() {
		double rate=200;
		System.out.println("Margeherita: "+rate+ "Rs");	
		System.out.println("Add number of items: ");
		int quantity=sc.nextInt();
		double tp=quantity*rate;
		System.out.println(quantity+ " Margeherita is "+tp+ "Rs");
	}

	public void eat() {
		System.out.println("Enjoy your Margeherita Pizza");
	}	
}
