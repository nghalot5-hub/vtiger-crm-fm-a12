package encapsulation;

public class Laptop {
	
	//Private members
	private String lName;
	private int lPrice;
	private String lSpec;
	private int lRAM;
	
	//Constructor
	Laptop(){
		
	}
	
	//setter
	public void setlName(String lName) {
		this.lName=lName;
	}
	
	public void setlPrice(int lPrice) {
		this.lPrice=lPrice;
	}
	
	public void setlSpec(String lSpec) {
		this.lSpec=lSpec;
	}
	
	public void setlRAM(int lRAM) {
		this.lRAM=lRAM;
	}
	
	//getters
	public String getlName() {
			return lName;
	}
	
	public int getlPrice() {
		return lPrice;
}
	
	public String getlSpec() {
		return lSpec;
	}
	
	public int getlRAM() {
		return lRAM;

	}
}