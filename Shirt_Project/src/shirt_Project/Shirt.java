package shirt_Project;

public class Shirt{
	String brand;
	double price;
	String color;
	int size;

	Shirt(){
	}
	
	//Constructor
	Shirt(String brand, double price, String color, int size){
	this.brand=brand;
	this.price=price;
	this.color=color;
	this.size=size;
	}
	
	//to print details
	@Override
	public String toString(){
		System.out.println("==============================================");
		return "Brand: "+brand+"\tPrice: "+price+"\tColor: "+color+"\tSize: "+size;
		}	
}
