package usingRunnableInterface;

public class VehicleDriver {

	public static void main(String[] args) {
		System.out.println("===============Main started===============");
		Vehicle v1=new Vehicle("Car", 10);
		Vehicle v2=new Vehicle("Bus", 15);
		Vehicle v3=new Vehicle("Auto",5);
		
		Thread t1=new Thread(v1);//thread object
		Thread t2=new Thread(v2);
		Thread t3=new Thread(v3);
		
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("===============Main stops==================");
	}

}
