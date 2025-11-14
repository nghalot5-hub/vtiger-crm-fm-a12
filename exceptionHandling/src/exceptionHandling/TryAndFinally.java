package exceptionHandling;

public class TryAndFinally {
	
	public static void main(String[] args) {
		System.out.println("Program STarts");

		try {
			System.out.println("This is try block");
			System.out.println(10 / 0);
		}finally {
			System.out.println("This is finally block");
		}

		System.out.println("Program Ends");
	}
}
