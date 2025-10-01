package inheritance_MultiLevel;

public class Car extends Vehicle {

	String type;
	String name;
	double price;
	String colour;
	Car(){
		super();
	}
	
	Car(String type, String name, double price, String colour){
		super(type); 
		this.name=name;
		this.price=price;
		this.colour=colour;
	}
	
	public String getDetails() {
		return super.getDetails()+"\nname of car is: "+name+"\nprice is: "+price+"\ncolour is "+colour;
	}
	
	public void drive() {
		System.out.println("drive car");
	}
	
	public void playMusic() {
		System.out.println("Play music in car");
	}

}
