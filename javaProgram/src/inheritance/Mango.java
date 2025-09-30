package inheritance;

public class Mango extends Fruit{
	String Mdesc, mavail;
	
	Mango(){
	}
	
	Mango(String fname, double fprice, String Mdesc, String mavail){
	super(fname,fprice);
	this.Mdesc=Mdesc;
	this.mavail=mavail;
	}
	
	public String getMangoDetails() {
		return super.getFruitDetails()+"\nMango description  is "+Mdesc+"\nMangos are avaiable in "+mavail+" season";
		}
	
	
	

}
