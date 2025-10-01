package constructor_Overloading;

public class Car {
	int price;
	String name;
	String colour;

	Car(int price) {
		this.price = price;
	}

	// changing datatype
	Car(String name) {
		this.name = name;
	}

	// changing number of argument
	Car(int price, String name) {
		this.price = price;
		this.name = name;
	}

	// changing the sequence of datatype
	Car(String name, String colour){
		this.name=name;
		this.colour=colour;
	}

	Car(String name, int price, String colour){
		this.name=name;
		this.price=price;
		this.colour=colour;
	}
	
	public String getDetails() {
		System.out.println("======geta details starts======");
		System.out.println("Car name is: "+name);
		System.out.println("Price of car is: "+price);
		System.out.println("Colour of car is: "+colour);
		System.out.println("======geta details ends======");
		return "Car name is: "+name+"\nPrice of car is: "+price+"\nColour of car is: "+colour;
	}
}
