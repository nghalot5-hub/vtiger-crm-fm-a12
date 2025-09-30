package shapeProject1;

public class Cylinder extends ThreeDShape{

	double r,h;
	Cylinder(){
	}
	
	Cylinder(double r, double h){
		this.r=r;
		this.h=h;
	}
	
	@Override
	public void getVolume() {
		System.out.println("Volume of Cylinder is "+Math.PI*r*r*h);
	}
	
	@Override
	public void getLSA() {
		System.out.println("LSA of Cylinder is "+2*Math.PI*r*h);
	}
	
	@Override
	public void getTSA() {
		System.out.println("TSA of Cylinder is "+2*Math.PI*r*(r+h));
	}
}
