package array_Assignment1;

import java.util.Scanner;

public class Q5 {

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
			if(num[j]>99 && num[j]<1000) {
			System.out.println("Ele=ment at "+(j+j)+" index is: "+num[j]);
			count++;
			}
		}
		
		System.out.println("==============================================");
		System.out.println("\nCount of three digit numbers in array are: "+count);
		sc.close();
			
	}

}
