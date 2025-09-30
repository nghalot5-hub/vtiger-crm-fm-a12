package initialize_Non_Static_Method;

public class Car {
	String name;
	int price;
	String colour;
		
	public void setName(String name) {
		this.name=name; //variable shadowing
	}
	
	public void setPrice(int price) {
		this.price=price; //variable shadowing
	}
	
	public void setColour(String colour) {
		this.colour=colour; //variable shadowing
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getColour() {
		return colour;
	}
	
	
}
