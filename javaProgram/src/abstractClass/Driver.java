package abstractClass;

public class Driver {

	public static void main(String[] args) {
		Vehicle v1=new ElectricCar("TATA", 200000, "Red", 120, "Petrol",120);
		v1.start();
		v1.drive();
		v1.accelerate();
		v1.stop();
		System.out.println(v1.getDetails());
		System.out.println("==============================================================");
		
		Car c1=(Car)v1;
		c1.openGate();
		c1.playMusic();
		System.out.println(c1.getDetails());
		System.out.println("---------------------------------------------------------------");
		
		ElectricCar e1=(ElectricCar)v1;
		e1.charge();
		System.out.println(e1.getDetails());
		System.out.println("***************************************************************");
		
	}

}
