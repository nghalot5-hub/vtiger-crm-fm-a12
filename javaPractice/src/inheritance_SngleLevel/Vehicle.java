package inheritance_SngleLevel;

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

}
