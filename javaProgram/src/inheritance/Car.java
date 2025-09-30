package inheritance;

public class Car extends Vehicle{
	String Name, type;
	double cprice, cavg;
	
	Car(){
		super();
	}
	
	Car(String vName, int yom, String Name, String type, double cprice, double cavg){
		super(vName,yom);
		this.Name=Name;
		this.type=type;
		this.cprice=cprice;
		this.cavg=cavg;
	}
	
	public String getCarDetails() {
		return super.getVehicleDetails()+"\nCar name is "+Name+"\nCar type is "+type+"\nPrice of car is "+cprice+"Rs\nAverage of car is "+cavg;
	}
	
	}
	
