package dominoProject2;

public class CheeseNCorn extends VegPizza {
	double rate;
	
	CheeseNCorn(){	
	}
	
	CheeseNCorn(double rate){	
		this.rate=rate;
		}
	
	public void placeOrder() {
		System.out.println("CheeseNCorn Pizza "+rate+ "Rs");	
		System.out.println("Add number of items: ");
		int quantity=sc.nextInt();
		double tp=quantity*rate;
		System.out.println(quantity+ " CheeseNCorn: "+tp+ "Rs");
		}
	
	public void eat() {
		System.out.println("Enjoy your CheeseNCorn Pizza");
	}		
}
