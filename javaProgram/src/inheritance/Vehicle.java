package inheritance;

public class Vehicle {
	String vName;
	int yom;
	
	Vehicle(){
	}
	
	Vehicle(String vName, int yom){
		this.vName=vName;
		this.yom=yom;
	}
	
	public String getVehicleDetails() {
		return "Vehicle name is "+vName+"\nYear of Manufacture is "+yom;
	}
	
	

}
