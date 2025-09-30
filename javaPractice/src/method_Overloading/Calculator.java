package method_Overloading;

public class Calculator {
	int x;
	int y;
	double a;
	double b;
	
	Calculator(){
		
	}
	
	public void add(int a, int b) {
		System.out.println("int, int arg add method");
		System.out.println("Sum is: "+(a+b));
	}
	
	public void add(double a, double b) {
		System.out.println("double, double arg add method");
		System.out.println("Sum is: "+(a+b));
	}
	
	public void sum(int a, double b) {
		System.out.println("int, double arg add method");
		System.out.println("Sum is: "+(a+b));
	}	
	
	public void sum(double a, int b) {
		System.out.println("double, int arg add method");
		System.out.println("Sum is: "+(a+b));
	}	
	
	public void sum(int a, int b, double c) {
		System.out.println("int, int, double arg add method");
		System.out.println("Sum is: "+(a+b+c));
	}	
	
	public static void sum(int a, double b, double c) {
		System.out.println("int, double, double arg add method");
		System.out.println("Sum is: "+(a+b+c));
	}	
	
	public static void sum(double a, int b, int c) {
		System.out.println("double, int, int arg add method");
		System.out.println("Sum is: "+(a+b+c));
	}	
}
