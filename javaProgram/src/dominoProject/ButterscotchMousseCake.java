package dominoProject;

public class ButterscotchMousseCake extends Dessert{
	ButterscotchMousseCake(){
	}

	public void placeOrder() {
		double rate=250;
		System.out.println("Butterscotch Mousse Cake "+rate+ "Rs");	
		System.out.println("Add number of items: ");
		int quantity=sc.nextInt();
		double tp=quantity*rate;
		System.out.println(quantity+ " Butterscotch Mousse Cake: "+tp+ "Rs");
		}
	
	public void eat() {
		System.out.println("Enjoy your Butterscotch Mousse Cake");
	}
}
