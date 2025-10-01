package initialize_Constructor;

public class CarDriver {

	public static void main(String[] args) {
		System.out.println("=========Main starts==========");
		Car c1 = new Car("TATA",20000,"Red");
		System.out.println(c1.getDetails());
		
		System.out.println("================================");
		
		Car c2 = new Car("Audi",660000,"Black");
		System.out.println(c2.getDetails());
		
		System.out.println("================================");
		
		Car c3 = new Car("Maruti",78000,"White");
		System.out.println(c3.getDetails());
		
		System.out.println("========Main ends============");
	}

}
