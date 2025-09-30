package whileLoopProrams;

public class DivisibleBy7EndsWith7 {

	public static void main(String[] args) {
		int i=1;
		System.out.println("=====Loop Starts=====");
		while(i<=100) {
			if(i%7==0 || i%10==7 ) {
				System.out.println(i);
			}		
			i++;
		}
		System.out.println("=====Loops Ends=====");

	}

}
