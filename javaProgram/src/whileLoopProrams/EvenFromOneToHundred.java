package whileLoopProrams;
public class EvenFromOneToHundred {

	public static void main(String[] args) {
		int i=1;
		System.out.println("=====Loop Starts=====");
		while(i<=100) {
			if(i%2==0) {
			System.out.println(i);
			}		
			i++;
		}
		System.out.println("=====Loops Ends=====");
	}

}
