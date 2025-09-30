package shapeProject1;

public class Circle extends TwoDShape {
	double r;
	
	Circle(){
	}
	
	Circle(double r){
		this.r=r;
	}
	
	@Override
	public void getArea() {
		System.out.println("Area of circle is " +Math.PI*r*r);
	}

	@Override
	public void getPerimeter() {
		System.out.println("Perimeter of circle is " +2*Math.PI*r);
	}
}

