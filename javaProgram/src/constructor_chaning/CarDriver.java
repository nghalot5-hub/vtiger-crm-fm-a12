package constructor_chaning;

public class CarDriver {

	public static void main(String[] args) {
		System.out.println("=======Main starts======");
		Car c1=new Car("TATA");
		Car c2=new Car(200000, "Maruti");
		Car c3=new Car("TATA",30000,"Red");
		System.out.println("======================");
		System.out.println(c1.getDetails());
		System.out.println("======================");
		System.out.println(c2.getDetails());
		System.out.println("======================");
		System.out.println(c3.getDetails());
		System.out.println("=======Main stops========"); 
	}

}
