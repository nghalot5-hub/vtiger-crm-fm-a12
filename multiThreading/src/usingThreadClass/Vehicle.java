package usingThreadClass;

public class Vehicle extends Thread{
	String name;
	int distance;
	
	Vehicle(){
		
	}
	
	Vehicle(String name, int distance){
		this.name=name;
		this.distance=distance;
	}
	
	public void run() {
		drive();
	}
	
	public void drive() {
		System.out.println("===========================");
		System.out.println("========"+name+" has started");
		
		for(int i=1;i<=distance;i++) {
			
			System.out.println(name+" has travelled "+distance+ "Kms");
			System.out.println("===========================");
		}
	
		System.out.println(name+" has reached at destination");
		System.out.println("===========================");
	}

}
