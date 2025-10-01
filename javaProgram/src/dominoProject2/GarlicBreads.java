package dominoProject2;

public class GarlicBreads extends GarlicBreadsAndMore {

	GarlicBreads(){	
	}
	
	public void placeOrder() {
		double rate=199;
		System.out.println("Garlic Breads: "+rate+ "Rs");	
		System.out.println("Add number of items: ");
		int quantity=sc.nextInt();
		double tp=quantity*rate;
		System.out.println(quantity+ "Garlic Breads: "+tp+ "Rs");	
		
	}
	
	public void eat() {
		System.out.println("Enjoy your Garlic Breads");
	}		
}
