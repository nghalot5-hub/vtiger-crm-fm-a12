package whileLoopProrams;

public class CoutFactorOfNumber {

	public static void main(String[] args) {
		int num=28,i=1,count=0;
		while(i<28) {
			if(num%i==0) {
			System.out.println("Factorial of 28 is " +i);
				count++;
				//System.out.println("Number of factorial are " +count);
				i++;
			}
			else 
				i++;
		}System.out.println("Number of factorial are " +count);

	}

}
