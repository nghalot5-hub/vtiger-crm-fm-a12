package dominoProject;

public class ChocoLavaCake extends Dessert{
	ChocoLavaCake(){
		}

		public void placeOrder() {
			double rate=199;
			System.out.println("Choco Lava Cake: "+rate+ "Rs");	
			System.out.println("Add number of items: ");
			int quantity=sc.nextInt();
			double tp=quantity*rate;
			System.out.println(quantity+ " Choco Lava Cake: "+tp+ "Rs");
		}
		
		public void eat() {
			System.out.println("Enjoy your Choco Lava Cake");
		}
}