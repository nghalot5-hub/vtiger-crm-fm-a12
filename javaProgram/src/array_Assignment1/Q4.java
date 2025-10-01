package array_Assignment1;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.print("Enter Size of an array: ");
		int size=sc.nextInt();
		int[] num=new int[size];
		for(int i=0;i<num.length;i++) {
			System.out.print("Enter "+(i+1)+" element: ");
			num[i]=sc.nextInt();
			
		}
		System.out.println("==============================================");
		for(int j=num.length-1;j>=0;j--) {
			System.out.println("Element at "+(j+j)+" index is: "+num[j]);

		}
		System.out.println("==============================================");
		System.out.println("\n");
		sc.close();
			
	}

}
