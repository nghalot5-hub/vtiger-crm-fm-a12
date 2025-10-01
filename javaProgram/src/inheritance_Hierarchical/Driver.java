package inheritance_Hierarchical;

public class Driver {

	public static void main(String[] args) {
		TwoDShape ts=new TwoDShape();
		ts.getDetails();
		
		Circle c=new Circle();
		c.getDetails();
		
		Square s=new Square();
		s.getDetails();
		
		Shape sp=new Shape();
		sp.getDetails();

	}

}
