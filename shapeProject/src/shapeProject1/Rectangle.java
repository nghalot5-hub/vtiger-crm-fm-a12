package shapeProject1;

public class Rectangle extends TwoDShape { //inheritance
	double l,w;
	Rectangle(){ //blank constructor is created to establish super() default constructor connection to parent class till Object Class. 
	}
	
	Rectangle(double l, double w){ //constructor  overloading
		this.l=l; //this keyword will assign the value of l to this.l means its refers to the  l inside the current constructor address
		this.w=w; //this keyword will assign the value of b to this.b means its refers to the  b inside the current constructor address
	}
	
	@Override
	public void getArea() { //method created same as created in TwoDShape class which will be overridden by child class method i.e., called as method overriding
		System.out.println("Area of Rectangle is "+l*w);
	}
	
	@Override
	public void getPerimeter() {
		System.out.println("Perimeter of Rectangle is " +2*(l+w));
	}
}

