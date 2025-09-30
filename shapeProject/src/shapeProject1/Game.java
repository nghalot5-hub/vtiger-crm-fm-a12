package shapeProject1;

import java.util.Scanner;

public class Game {
	Scanner sc=new Scanner(System.in);
	public void startGame() {

		System.out.println("Press 1: TwoDShape \nPress 2: ThreeDShape");
		System.out.println("============================================");
		int choice=sc.nextInt();
		System.out.println("============================================");
		switch(choice) {
		case 1:
			TwoDShape tds=selectTwoDShape();
			tds.getArea();
			tds.getPerimeter();
			break;
		case 2: 
			ThreeDShape thds=selectThreeDShape();
			thds.getVolume();
			thds.getLSA();
			thds.getTSA();
			break;
		default:
			System.out.println("INVALID choice, Try again");
			System.out.println("-------------------------------------------");
			startGame();
			}
		}

	public TwoDShape selectTwoDShape() { //selectTWoDShape Subclass object Circle/Rectangle/Square

		System.out.println("Select 1 for ---> Circle");
		System.out.println("Select 2 for ---> Rectangle");
		System.out.println("Select 3 for ---> Square");
		System.out.println("============================================");
		int choice=sc.nextInt();
		System.out.println("============================================");
		System.out.println("You have entered " +choice);
		System.out.println("============================================");
		
		if(choice==1) {	
			System.out.println("Enter Radius of circle ");
			System.out.println("-------------------------------------------");
			double r=sc.nextDouble();
			System.out.println("-------------------------------------------");
			Circle c1=new Circle(r);
		return c1;
		}
		else if(choice==2){
			System.out.println("Enter length of rectangle ");
			System.out.println("-------------------------------------------");
			double l=sc.nextDouble();
			System.out.println("-------------------------------------------");
			System.out.println("Enter breadth of rectangle ");
			System.out.println("-------------------------------------------");
			double b=sc.nextDouble();
			System.out.println("-------------------------------------------");
			Rectangle r1=new Rectangle(l,b);
		return r1;
		}
		else if(choice==3) {
			System.out.println("Enter side of square ");
			System.out.println("-------------------------------------------");
			double side=sc.nextDouble();
			System.out.println("-------------------------------------------");
			Square s1=new Square(side);
		return s1;
		}
		else {
			System.out.println("You have entered INVALID choice, Try again");
			System.out.println("-------------------------------------------");
		return selectTwoDShape();
		}
	}
		
		public ThreeDShape selectThreeDShape() { 
			//selectThreeDShape Subclass object Cylinder/Cone/Cube

			System.out.println("Press 1: Cylinder \nPress 2: Cone \nPress 3: Cube");
			System.out.println("============================================");
			int choice=sc.nextInt();
		
			System.out.println("============================================");
			switch(choice) {
			case 1:
				System.out.println("You have entered " +choice+ ": Cylinder");
				System.out.println("Enter Radius of Cylinder ");
				System.out.println("-------------------------------------------");
				double r=sc.nextDouble();
				System.out.println("Enter height of Cylinder ");
				System.out.println("-------------------------------------------");
				double h=sc.nextDouble();
				System.out.println("-------------------------------------------");		
				Cylinder c1=new Cylinder(r,h);
				return c1;
			
			case 2:
				System.out.println("You have entered " +choice+ ": Cone");
				System.out.println("Enter radius of Cone ");
				System.out.println("-------------------------------------------");
				double r1=sc.nextDouble();
				System.out.println("-------------------------------------------");
				System.out.println("Enter height of cone ");
				System.out.println("-------------------------------------------");
				double h1=sc.nextDouble();
				System.out.println("-------------------------------------------");
				Cone co1=new Cone(r1,h1);
				System.out.println("Enter length of cone ");
				System.out.println("-------------------------------------------");
				double l=sc.nextDouble();
				System.out.println("-------------------------------------------");
				Cone co=new Cone(co1,l);			
			 return co;

			case 3: 
				System.out.println("You have entered " +choice+ ": Cube");
				System.out.println("Enter side of Cube ");
				System.out.println("-------------------------------------------");
				double a=sc.nextDouble();
				System.out.println("-------------------------------------------");		
				Cube cu=new Cube(a);
				return cu;
			
			default:
				System.out.println("INVALID choice, Try again");
				System.out.println("-------------------------------------------");
				return selectThreeDShape();
			}	
	}
}
