package array_Assignment1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		
		System.out.print("Enter Size of an array: ");
		int size=sc.nextInt();
		int[] num=new int[size];
		for(int i=0;i<num.length;i++) {
			System.out.print("Enter "+(i+1)+" element: ");
			num[i]=sc.nextInt();
			
		}
		System.out.println("==============================================");
		for(int j=0;j<num.length;j++) {
			if(num[j]%2==0) {
				System.out.println("Element at "+(j+j)+" index is: "+num[j]);
			count++;
			}
		}
		System.out.println("==============================================");
		System.out.println("\nCount of even number in element are: "+count);
		sc.close();
			
	}

}
