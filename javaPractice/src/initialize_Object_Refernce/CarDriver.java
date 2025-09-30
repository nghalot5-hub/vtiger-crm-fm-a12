package initialize_Object_Refernce;

public class CarDriver {

	public static void main(String[] args) {
		System.out.println("=========Main starts==========");

		Car c1 = new Car();
		c1.name = "Tata";
		c1.price = 500000;
		c1.colour = "Red";
		System.out.println(c1.name);
		System.out.println(c1.price);
		System.out.println(c1.colour);

		System.out.println("=================================");

		Car c2 = new Car();
		c2.name = "Maruti";
		c2.price = 100000;
		c2.colour = "Pink";
		System.out.println(c2.name);
		System.out.println(c2.price);
		System.out.println(c2.colour);

		System.out.println("=================================");

		Car c3 = new Car();
		c3.name = "Audi";
		c3.price = 1000000;
		c3.colour = "Black";
		System.out.println(c3.name);
		System.out.println(c3.price);
		System.out.println(c3.colour);

		System.out.println("========Main ends============");

	}

}
