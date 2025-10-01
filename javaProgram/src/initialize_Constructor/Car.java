package initialize_Constructor;

public class Car {
	String name;
	int price;
	String colour;
	
	//Non-Parameterized constructor
	Car(){
		
	}
	
	//Parameterized constructor
	Car(String name, int price, String colour){
		this.name=name;
		this.price=price;
		this.colour=colour;
		}
	
	public String getDetails() {
		return "car name is"+name+ "\nPrice of car is: "+price+"\nColour of car is :"+colour;
	}
}
