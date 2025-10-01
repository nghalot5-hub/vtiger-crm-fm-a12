package constructor_Overloading;

public class CarDriver {

	public static void main(String[] args) {
		Car c1=new Car(20000);
		Car c2=new Car("Tata");
		Car c3=new Car(20000, "Maruti");
		Car c4=new Car("TATA", "Red");
		Car c5=new Car("TATA",20000,"Red");
		System.out.println("=========Main starts========");
		System.out.println(c1.getDetails());
		System.out.println("=============================");
		System.out.println(c2.getDetails());
		System.out.println("=============================");
		System.out.println(c3.getDetails());
		System.out.println("=============================");
		System.out.println(c4.getDetails());
		System.out.println("=============================");
		System.out.println(c5.getDetails());
		System.out.println("=========Main ends=======");

	}

}
