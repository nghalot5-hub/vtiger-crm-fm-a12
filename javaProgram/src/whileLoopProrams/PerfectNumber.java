package whileLoopProrams;
import java.util.Scanner;

public class PerfectNumber 
{
	public static boolean perfectNumber(int num) 
	{
		int sum=1, i=2;
		if(num<6)
			return false;
		while(i*i<=num) 
		{
			if(num%i==0) 
			{
				int fact1=i;
				int fact2=num/i;
				if(fact1!=fact2)
					sum=sum+fact1+fact2;
				else 
					sum=sum+fact1;
			}
			i++;
		}
		return sum==num;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("To check Perfect number. \nPlease enter a number: ");
		System.out.println("-------------------------------------------------------------");
		int num=sc.nextInt();
		boolean pn=perfectNumber(num);
		if(pn==false) {
			System.out.println("-------------------------------------------------------------");
			System.out.println(num+" is not a perfect number");
		}
		else {
			System.out.println("-------------------------------------------------------------");		
			System.out.println(num+" is a perfect number");
		}	
	}
}
