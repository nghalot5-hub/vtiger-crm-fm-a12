package exceptionHandling;

public class TryCatchFinally {
	public static void main(String[] args) {
		System.out.println("Program STarts");

		try {
			System.out.println("This is try block");
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println("This is finally block");
		}

		System.out.println("Program Ends");
	}
}
