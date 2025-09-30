package automationProgrammingQuestions;

public class Q3_FindDuplicateElementsInAnArrayWithoutStream {

	public static void main(String[] args) {
		int [] a= {22,29,12,12,12,12,45,12,65,74,44,44};
	FindDuplicateElementsInAnArray(a);
		//System.out.println("Duplicates are: "+dup);
	}
	
		public static void FindDuplicateElementsInAnArray(int[] a) {
			int max=a[0];
			int min=a[0];
			for(int i=0;i<a.length;i++) {
				if(a[i]>max)
					max=a[i];
				else if(a[i]<min)
					min=a[i];
			}
			int[] freq=new int[max-min+1];
			for(int i=0;i<a.length;i++)
					freq[a[i]-min]++;
				
			for(int i=0;i<freq.length;i++)
				if(freq[i]>1)
					System.out.println((i+min)+" is "+freq[i]+" times");//return duplicate elements		
	}
}