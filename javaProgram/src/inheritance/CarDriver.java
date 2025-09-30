package inheritance;

public class CarDriver {

	public static void main(String[] args) {
		Car c1=new Car("Car",1996,"Tata", "Fully Automatic",2200000,120);
		System.out.println(c1.getCarDetails());
		System.out.println("===========================================");
		Vehicle v1=new Vehicle("Truck",2000);
		System.out.println(v1.getVehicleDetails());

	}

}
