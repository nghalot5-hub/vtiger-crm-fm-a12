package practice_Java_Program;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] a= {20,10,22,19,1,20};
		for (int i : a) {
			System.out.print(i+" ");
		}
		a=reverseArray(a);
		System.out.println("\nAfter reverse array");
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
		
		public static int[] reverseArray(int[] a) {
		int start=0;
		int end=a.length-1;
			while(start<end) {
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;
				start++; end--;
			}
			return a;
			
		}

	

}
