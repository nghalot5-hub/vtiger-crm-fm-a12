package vehicleProject;

public class User {

	public static void main(String[] args) {
		Travel tr=new Travel();
		Vehicle v1=tr.selectVehicle();
		v1.start();
		v1.drive();
		v1.stop();
		}
}
