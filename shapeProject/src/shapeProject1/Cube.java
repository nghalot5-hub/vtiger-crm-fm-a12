package shapeProject1;

public class Cube extends ThreeDShape{
	double a;
	Cube(){
	}
	
	Cube(double a){
		this.a=a;
	}
	
	@Override
	public void getVolume(){
		System.out.println("Volume of Cube is "+a*a*a);
	}
	
	@Override
	public void getLSA() {
		System.out.println("LSA of Cube is "+4*a*a);
	}
	
	@Override
	public void getTSA() {
		System.out.println("TSA of Cube is "+6*a*a);
	}

}
