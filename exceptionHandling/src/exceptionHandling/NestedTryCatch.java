package exceptionHandling;

public class NestedTryCatch {
	public static void main(String[] args) {
		int[] a = { 12, 18, 0, 60, 54 };
		int ind=9;
		//int ind = sc.nextInt(); //InputMismatch exception
		try {
			System.out.println(a[ind]); //ArrayIndexOutOfBoundException
				try {
					System.out.println(240/a[ind]); //ArithmeticException
					} catch (ArithmeticException e) {
						System.err.println(e.getMessage());
					}
			}catch(ArrayIndexOutOfBoundsException e){
				System.err.println(e.getMessage());
			}
	}
}
