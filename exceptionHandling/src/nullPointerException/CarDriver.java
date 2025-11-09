package nullPointerException;

public class CarDriver {

	public static void main(String[] args) {
		Car c1=new Car("Tata");
		System.out.println("Name: "+c1.name);
		c1=null;
		System.out.println("Name: "+c1.name);
	}

}
