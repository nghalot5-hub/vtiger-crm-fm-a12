package gradeCalculator;

import java.util.Scanner;

public class GradeCalculator {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int percentage; char ch;
		int sum=0;
		do {
			System.out.print("Enter Maths marks: ");
			int maths=sc.nextInt();
			System.out.print("Enter Science marks: ");
			int sci=sc.nextInt();
			System.out.print("Enter English marks: ");
			int eng=sc.nextInt();
			System.out.print("Enter Hindi marks: ");
			int hindi=sc.nextInt();
			System.out.print("Enter Social Science marks: ");
			int sstd=sc.nextInt();
			sum=sum+maths+sci+eng+hindi+sstd;
			percentage=sum/5;
			System.out.println("Total percentage: "+percentage+" %");
		
		if(percentage>=90 )
			System.out.println("You have scoed Grade A");
		else if(percentage>=75)
			System.out.println("You have scoed Grade B");
		else if(percentage>=60)
			System.out.println("You have scoed Grade C");
		else if(percentage>=45)
			System.out.println("You have scoed Grade D");
		else if(percentage>0)
			System.out.println("You have scoed Grade E");
		else
            System.out.println("Invalid marks entered!");
		
		System.out.println("Press Y/y: do you want to enter for another student");
		System.out.println("===============================================================");
		ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
			System.out.println("======Thank you for using the application=======");	
			sc.close();
	}

}
