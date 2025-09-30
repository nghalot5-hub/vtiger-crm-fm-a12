package copy_Constructor_;

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
	
	public Car(int price, Car c){
		this.name=c.name;
		this.price=price;
	}
	
	public Car(Car p, String colour){
		this.name=p.name; //copy constructor
		this.price=p.price;
		this.colour=colour;
	}
	
	public String getDetails() {
		return "Car name is: "+name+"\nPrice of car is: "+price+"\nColour of car is: "+colour;
	}
}
