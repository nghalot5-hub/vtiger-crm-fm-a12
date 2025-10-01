package dominoProject;

public class ChickenPepperoni extends NonVegPizza {
	
	ChickenPepperoni(){	
	}
	
	public void placeOrder() {
		double rate=650;
		System.out.println("Chicken Pepperoni: "+rate+ "Rs");	
		System.out.println("Add number of items: ");
		int quantity=sc.nextInt();
		double tp=quantity*rate;
		System.out.println(quantity+ " Chicken Pepperoni: "+tp+ "Rs");
	}
	
	public void eat() {
		System.out.println("Enjoy your Chicken Pepperoni Pizza");
	}	

}
