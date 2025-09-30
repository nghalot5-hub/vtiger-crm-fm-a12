package shapeProject1;

public class Cone extends ThreeDShape{

	double r,h,l;
	Cone(){
	}
	
	Cone(double r, double h){
		this.r=r;
		this.h=h;
	}
	
	//CopyConstractor
	Cone(Cone p, double l){
		this.r=p.r;
		this.h=p.h;
		this.l=l;
	}
	
	@Override
	public void getVolume() {
		System.out.println("Volume of Cone is "+1/3*(Math.PI*r*r*h));
	}
	
	@Override
	public void getLSA() {
		System.out.println("LSA of Cone is "+Math.PI*r*l);
	}
	
	@Override
	public void getTSA() {
		System.out.println("TSA of Cone is "+Math.PI*r*(r+l));
	}
}
