package dominoProject2;

public class CheesyDip extends GarlicBreadsAndMore {
	
	CheesyDip(){	
	}
	
	public void placeOrder() {
		double rate=100;
		System.out.println("Cheesy Dip: "+rate+ "Rs");	
		System.out.println("Add number of items: ");
		int quantity=sc.nextInt();
		double tp=quantity*rate;
		System.out.println(quantity+ " Cheesy Dip: "+tp+ "Rs");
	}
	
	public void eat() {
		System.out.println("Enjoy your Cheesy Dip");
	}		

}
