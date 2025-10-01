package dominoProject2;

public class CheeseVolcanoPeppyPaneer extends VegPizza  {
	double rate;
	int quantity;

	CheeseVolcanoPeppyPaneer(){
	}
	
	CheeseVolcanoPeppyPaneer (int quantity){
		this.quantity=quantity;
	}
	
	public void placeOrder() {
		double rate=200;
		System.out.println("Cheese Volcano Peppy Paneer Pizza "+rate+ " Rs");	
		double tp=quantity*rate;
		System.out.println(quantity+ " Cheese Volcano Peppy Paneer Pizza: "+tp+ " Rs");
		}
		
	public void eat() {
		System.out.println("Enjoy your Cheese Volcano Peppy Paneer Pizza");
	}

	
	
}
