package inheritance_MultiLevel;

public class Vehicle {
	String type;
	Vehicle(){
		super();
	}
	
	public Vehicle(String type){
		this.type=type;
	}

	public String getDetails() {
		return "type of vehicle is :"+type;
	}
	
	public void drive() {
		System.out.println("Drive vehicle");
	}

}
