package automationProgrammingQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q3_FindDuplicateElementsInAnListWithStream {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(20);l1.add(13);l1.add(12);l1.add(19);l1.add(12);l1.add(20);
		Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = l1.stream().filter(n -> !seen.add(n)).collect(Collectors.toList());
        System.out.println("Original list: " + l1);
        System.out.println("Duplicate elements: " + duplicates);    
	}
}