package exceptionHandling;

public class NumberFormatException_example {
	public static void main(String[] args) {
		String s1="38a6";
		System.out.println(s1);
		System.out.println(s1+100);
		int x=Integer.parseInt(s1);
		System.out.println(x);
		System.out.println(x+100);
	}
}
