package constructor_chaning;

public class Car {
	int price;
	String name;
	String colour;
	public Car(){
		System.out.println("Blank constructor");
	}
	
	public Car(String name){
		this();
		this.name=name;
	}
	
	public Car(int price, String name){
		this(name); //constructor chaining
		//this.name=name;
		this.price=price;
	}
	
	public Car(String name, int price, String colour){
		this(price,name); //constructor chaining
		//this.name=name;
		//this.price=price;
		this.colour=colour;
	}
	
	public String getDetails() {
		return "Car name is: "+name+"\nPrice of car is: "+price+"\nColour of car is: "+colour;
	}
}
