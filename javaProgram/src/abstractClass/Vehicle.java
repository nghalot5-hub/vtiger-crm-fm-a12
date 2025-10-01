package abstractClass;

public abstract class Vehicle { //abstract class
	String name;
	double price;
	String color;
	
	Vehicle(){  //constructor		
	}
	
	Vehicle(String name, double price, String color){ //parameterized constructor
		this.name=name;
		this.price=price;
		this.color=color;
	}
	
	public abstract void start(); //abstract method
	public abstract void drive(); //abstract method
	
	public void accelerate() {   //concrete method
		System.out.println("Accelerate Vehicle");
	}

	public void stop() {   //concrete method
		System.out.println("stop Vehicle");
	}
	
	public String getDetails() {   //concrete method
		return "Name is: "+name+"\nPrice is: "+price+"\nColor is: "+color;
	}
}
