package Extra;

import java.util.ArrayList;
import java.util.List;

public class ExplanationList {
	
	public static void main(String[] args) {
		//We need to perform upcasting till list from ArrayList
		List<String> students = new ArrayList<>();
		
		students.add("Abhishek");
		students.add("Baburao ganpat aapte");
		students.add("Nidhi");
		students.add("Elephant");
		students.add("Elephant"); //Duplicate can be allowed
		students.add("Ankit");
		
		//students.remove(1);
		//students.remove("Elephant");

		//size() method will return the length of the collection
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));	//get(index) method -> Proof that list allows ordered elements
		}
		
	}

}
