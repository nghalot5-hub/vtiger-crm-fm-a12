package whileLoopProrams;

public class DivisibleBy7 {

	public static void main(String[] args) {
		int i=1;
		System.out.println("=====Loop Starts=====");
		while(i<=100) {
			if(i%7==0) {
				System.out.println(i);
			}		
			i++;
		}
		System.out.println("=====Loops Ends=====");
	}

}
