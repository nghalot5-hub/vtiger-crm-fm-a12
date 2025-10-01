package abstractClass;

public class ElectricCar extends Car{
	int volt;
	
	ElectricCar(){
	}
	
	ElectricCar(String name, double price, String color, int hp, String engineType, int volt){
		super(name,price,color,hp,engineType);
		this.volt=volt;		
	}
	
	@Override
	public void start() {
		System.out.println("Start Electric car");
	}
	
	@Override
	public void drive() {
		System.out.println("drive Electric car");
	}
	
	@Override
	public void openGate() {
		System.out.println("open Electric car gate");	
	}
	
	public void charge() {
		System.out.println("Charge electric car");
	}
	
	public String getDetails() {
		return super.getDetails()+"\nVolt is: " +volt;
	}
}
