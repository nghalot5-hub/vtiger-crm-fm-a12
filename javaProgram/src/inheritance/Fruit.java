package inheritance;

public class Fruit {
	String fname;
	double fprice ;
	
	Fruit(){
	}
	
	Fruit(String fname, double fprice){
		this.fname=fname;
		this.fprice=fprice;	
	}
	
	public String getFruitDetails() {
	return "Fruit name is "+fname+"\nFruit price is "+fprice+" Rs";
	}
}
