package dominoProject;

public class VegParcel extends GarlicBreadsAndMore{
	VegParcel(){
	}
	
	public void placeOrder() {
		double rate=80;
		System.out.println("Veg Parcel: "+rate+ "Rs");	
		System.out.println("Add number of items: ");
		int quantity=sc.nextInt();
		double tp=quantity*rate;
		System.out.println(quantity+ "Veg Parcel: "+tp+ "Rs");
		}
	
	public void eat() {
		System.out.println("Enjoy your Veg Parcel");
	}		
}
