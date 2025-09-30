package usingThreadClass;

public class VehicleDriver {

	public static void main(String[] args) {
		System.out.println("===============Main started===============");
		Vehicle v1=new Vehicle("Car", 10);//
		Vehicle v2=new Vehicle("Bus", 15);
		Vehicle v3=new Vehicle("Auto",5);
		
		v1.start();
		v2.start();
		v3.start();
		
		System.out.println("===============Main stops==================");
	}

}
