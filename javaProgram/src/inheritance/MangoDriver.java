package inheritance;

public class MangoDriver {

	public static void main(String[] args) {
		Mango m1=new Mango("Mango",200, "King of fruits","Summer");
		System.out.println(m1.getMangoDetails());
		System.out.println("===========================================");
		Fruit f1=new Fruit("Apple",250);
		System.out.println(f1.getFruitDetails());

	}

}
