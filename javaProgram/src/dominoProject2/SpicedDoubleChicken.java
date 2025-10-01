package dominoProject2;

public class SpicedDoubleChicken extends NonVegPizza{
	
	SpicedDoubleChicken(){	
	}
	
	public void placeOrder() {
		double rate=400;
		System.out.println("Special Double Chicken Pizza: "+rate+ "Rs");	
		System.out.println("Add number of items: ");
		int quantity=sc.nextInt();
		double tp=quantity*rate;
		System.out.println(quantity+ " Special Double Chicken Pizza is "+tp+ "Rs");	
	}
	
	public void eat() {
		System.out.println("Enjoy your Special Double Chicken Pizza");
	}	

}
