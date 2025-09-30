package automationProgrammingQuestions;

import java.util.Arrays;

public class Q7_RemoveDuplicateElementsFromAnArray {

	public static void main(String[] args) {
		int[] a = { 22, 29, 12, 12, 12, 12, 45, 12, 65, 74, 44, 44 };
		Arrays.stream(a).distinct().forEach((e) -> System.out.print(e + "  "));
	}
}