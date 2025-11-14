package exceptionHandling;

import java.util.Scanner;

public class TryCatchFinally {
	public static void main(String[] args) {
		
	
		System.out.println("Program STarts");

		try (Scanner sc=new Scanner(System.in);){
			int num=sc.nextInt();
			System.out.println(num);
			System.out.println("This is try block");
			System.out.println(10 / 0);
			System.out.println("Hello ji");
		} 
		catch (Exception e) {
			System.err.println(e.getMessage());
		}finally {
			System.out.println("This is finally block");
		}
		System.out.println("Program Ends");
	}
}
