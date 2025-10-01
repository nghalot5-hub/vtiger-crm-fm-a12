package dominoProject;

public class NonVegParcel extends GarlicBreadsAndMore {
	NonVegParcel(){
	}
	
	public void placeOrder() {
		double rate=60;
		System.out.println("Non-Veg Parcel: "+rate+ "Rs");	
		System.out.println("Add number of items: ");
		int quantity=sc.nextInt();
		double tp=quantity*rate;
		System.out.println(quantity+ "Non-Veg Parcel: "+tp+ "Rs");	
		}
	
	public void eat() {
		System.out.println("Enjoy your Non-Veg Parcel");
	}		

}
