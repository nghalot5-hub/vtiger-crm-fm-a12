package dominoProject;

public class Farmhouse extends VegPizza {
	Farmhouse(){	
	}
	
	public void placeOrder() {
		double rate=199;
		System.out.println("Farmhouse pizza: "+rate+ "Rs");	
		System.out.println("Add number of items: ");
		int quantity=sc.nextInt();
		double tp=quantity*rate;
		System.out.println(quantity+ "Farmhouse pizza: "+tp+ "Rs");
	}
	
	public void eat() {
		System.out.println("Enjoy your Farmhouse Pizza");
	}	
	
}
