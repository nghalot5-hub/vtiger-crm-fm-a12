package vendingMachine;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendingMachine vm=new VendingMachine();
		Beverage b=vm.selectBeverage();
		b.drink();
	}

}
