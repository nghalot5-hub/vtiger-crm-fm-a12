package automationProgrammingQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q7_RemoveDuplicateElementsFromAnList {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(20);
		l1.add(13);
		l1.add(12);
		l1.add(19);
		l1.add(12);
		l1.stream().distinct().forEach((e) -> System.out.println("Unique elements are: " + e + "  "));
	}
}