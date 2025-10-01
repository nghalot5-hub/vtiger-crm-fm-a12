package dominoProject2;

public class NagpurOrange extends Beverages{
	NagpurOrange(){
	}

	public void placeOrder() {
		double rate=80;
		System.out.println("Nagpur Orange: "+rate+ "Rs");	
		System.out.println("Add number of items: ");
		int quantity=sc.nextInt();
		double tp=quantity*rate;
		System.out.println(quantity+ "Nagpur Orange: "+tp+ "Rs");	
		
	}
	
	public void drink() {
		System.out.println("Enjoy your Nagpur Orange juice");
	}
}
