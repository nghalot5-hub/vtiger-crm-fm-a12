package inheritance_MultiLevel;

public class ElectricCar extends Car {
	String type;
	String name;
	double price;
	String colour;
	ElectricCar(){
		super();
	}
	
	ElectricCar(String type, String name, double price, String colour){
		super(type,name,price,colour); 
	}
	
	public String getDetails() {
		return super.getDetails();
	}

	public void openGate() {
		System.out.println("Open gate of electric car");
	}
}
