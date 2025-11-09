package exceptionHandling;

public class MultipleCatchBlock {
	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		int[] c = { 0, 2 };
		Object x = "String";

		try {
			System.out.println(a / b); 
			System.out.println(c[1]);
			System.out.println((Integer) x);
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
