package abstractClass;

public abstract class Car extends Vehicle {  //abstract class
	int hp;
	String engineType;
	
	Car(){	
	} 

	Car(String name, double price, String color, int hp, String engineType){
		super(name,price,color);
		this.hp=hp;
		this.engineType=engineType;		
	}
	
	public abstract void openGate();				//abstract method
	
	public void playMusic() {						//concrete method
		System.out.println("Play music in car");	
	}
	
	public String getDetails() {   //concrete method
		return super.getDetails()+"\nhp is: "+hp+"\nEngine Type is: "+engineType;
	}	
}

