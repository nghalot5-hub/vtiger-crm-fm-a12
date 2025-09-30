package automationProgrammingQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Q3_FindDuplicateElementsInAnArray {

	public static void main(String[] args) {
		Integer [] a= {22,29,12,12,12,12,45,12,65,74,44,44};
		Set<Integer> dup=FindDuplicateElementsInAnArray(a);
		System.out.println("Duplicates are: "+dup);
	}
	
		private static <T> Set<T> FindDuplicateElementsInAnArray(T[] a) {
			Set<T> seen=new HashSet<>();
			return Arrays.stream(a)
	                .filter(e -> !seen.add(e))  // only those for which add(e) returns false (i.e. already seen)
	                .collect(Collectors.toSet());
	}
}