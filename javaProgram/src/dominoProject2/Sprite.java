package dominoProject2;

public class Sprite extends Beverages{
	Sprite(){
	}

	public void placeOrder() {
		double rate=80;
		System.out.println("Sprite: "+rate+ "Rs");	
		System.out.println("Add number of items: ");
		int quantity=sc.nextInt();
		double tp=quantity*rate;
		System.out.println(quantity+ "Sprite: "+tp+ "Rs");	
		}
	
	public void drink() {
		System.out.println("Enjoy your Sprite");
	}
}