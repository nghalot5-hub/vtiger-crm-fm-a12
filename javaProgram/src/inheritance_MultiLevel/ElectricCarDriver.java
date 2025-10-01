package inheritance_MultiLevel;

public class ElectricCarDriver {

	public static void main(String[] args) {
		ElectricCar c1=new ElectricCar("4wheeler","TATA",300000,"Red");
		System.out.println(c1.getDetails());
		c1.playMusic();
		c1.drive();
		c1.openGate();
		
		System.out.println("====================");
		Car c2=new Car("Four Wheeler","Maruti",550000,"White");
		System.out.println(c2.getDetails());
		c2.playMusic();
		c2.drive();
		
		System.out.println("====================");
		Car c3=new ElectricCar("four wheeler","Audi",70000,"Black"); //upcasting
		System.out.println(c3.getDetails());
		c3.playMusic();
		c3.drive();
		
		System.out.println("====================");
		ElectricCar ec1=(ElectricCar)c3;//downcating
		System.out.println("====================");
		System.out.println(ec1.getDetails());
		ec1.openGate();
		ec1.playMusic();
		ec1.drive();
		
		
	}

}
