package whileLoopProgram3;

import java.util.Scanner;

public class AlternatingBits {
    public static boolean hasAlternatingBits(int n) {
    	int num=1;
		while(num<=n) {
			if(num==n)
				return true;
        else if(num%2==0)	
            num=num*2+1;
        else
            num=2*num;
        }
	return false;
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		if(hasAlternatingBits(n))
			System.out.println(n+ " has alternate binary bits.");
		else
			System.out.println(n+ " has not alternate binary bits.");

		sc.close();
	}
}
