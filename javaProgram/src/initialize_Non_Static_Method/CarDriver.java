package initialize_Non_Static_Method;

public class CarDriver {

	public static void main(String[] args) {
		System.out.println("=========Main starts==========");
		Car c1 = new Car();
		c1.setName("TATA");
		c1.setPrice(20000);
		c1.setColour("red");
		System.out.println("Car name is : " + c1.getName());
		System.out.println("Price of car is :" + c1.getPrice() + " Rs");
		System.out.println("Colour of car is :" + c1.getColour());
		System.out.println("================================");
		Car c2 = new Car();
		c2.setName("Audi");
		c2.setPrice(60000);
		c2.setColour("Black");
		System.out.println("Car name is : " + c2.getName());
		System.out.println("Price of car is :" + c2.getPrice() + " Rs");
		System.out.println("Colour of car is :" + c2.getColour());
		System.out.println("================================");
		Car c3 = new Car();
		c3.setName("Maruti");
		c3.setPrice(70000);
		c3.setColour("White");
		System.out.println("Car name is : " + c3.getName());
		System.out.println("Price of car is :" + c3.getPrice() + " Rs");
		System.out.println("Colour of car is :" + c3.getColour());
		System.out.println("========Main ends============");

	}

}
