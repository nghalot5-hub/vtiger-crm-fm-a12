package dominoProject;

public class ChickenDominator extends NonVegPizza{
	
	ChickenDominator(){	
	}
	
	public void placeOrder() {
		double rate=600;
		System.out.println("Chicken Dominator: "+rate+ "Rs");	
		System.out.println("Add number of items: ");
		int quantity=sc.nextInt();
		double tp=quantity*rate;
		System.out.println(quantity+ " Chicken Dominator: "+tp+ "Rs");
	}
	
	public void eat() {
		System.out.println("Enjoy your Chicken Dominator Pizza");
	}	

}
