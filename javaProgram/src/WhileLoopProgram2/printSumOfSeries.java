package WhileLoopProgram2;

public class printSumOfSeries {
	
	public static int getSumOfSeries(int n) {
		int n1=1, n2=2, n3=0;
		System.out.println("===========Method starts=========");	
		while(n1<=n) {
			n2*=n1;
			n3+=n2;
			n1++;
			n2++;
		} System.out.println("sum is :"+n3);
		System.out.println("===========Method Ends=========");	

	return n3;
	}

	public static void main(String[] args) {
		System.out.println("===========Main Method starts=========");	
		int sum=getSumOfSeries(100);
		System.out.println("sum is :"+sum);
		System.out.println("===========Main Method ends=========");	


	}

}
