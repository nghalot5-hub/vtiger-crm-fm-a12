package dominoProject;

public class CocaCola extends Beverages{
	CocaCola(){
	}

	public void placeOrder() {
		double rate=70;
		System.out.println("Coca Cola: "+rate+ "Rs");	
		System.out.println("Add number of items: ");
		int quantity=sc.nextInt();
		double tp=quantity*rate;
		System.out.println(quantity+ " Coca Cola: "+tp+ "Rs");
		}
	
	public void drink() {
		System.out.println("Enjoy your Coca Cola");
	}
}
