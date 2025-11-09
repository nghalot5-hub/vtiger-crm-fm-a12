package exceptionHandling;

public class ClassCastException_example {
	public static void main(String[] args) {
		Object x= "Mohan";
		String s=(String)x;
		System.out.println(s.length());
		System.out.println(((String)x).length());
		System.out.println(((Integer)x));
	}

}
