package methods;

public class NonParameterizedMethods {
	public static void demo() {
		int x=20;
		System.out.println("The number you have entered is "+x);
	}

	public static void main(String[] args) {
		System.out.println("=====Main method starts====");
		NonParameterizedMethods.demo();
		NonParameterizedMethods.test();
		System.out.println("=====Main method stops====");
	}
	
	public static void test() {
			System.out.println("Test methos");
	}


}
