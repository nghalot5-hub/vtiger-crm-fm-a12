package dominoProject;

public class PeppyPaneer extends VegPizza {
	
	PeppyPaneer(){	
	}
	
	public void placeOrder() {
		double rate=250;
		System.out.println("Peppy Paneer: "+rate+ "Rs");	
		System.out.println("Add number of items: ");
		int quantity=sc.nextInt();
		double tp=quantity*rate;
		System.out.println(quantity+ " Peppy Paneer is "+tp+ "Rs");
		}
	
	public void eat() {
		System.out.println("Enjoy your Peppy Paneer Pizza");
	}		
}
