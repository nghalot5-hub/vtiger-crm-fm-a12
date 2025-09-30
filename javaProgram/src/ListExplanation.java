import java.util.ArrayList;
import java.util.List;
public class ListExplanation {

	public static void main(String[] args) {
		List<Object> students = new ArrayList<Object>();
		students.add("Nidhi");
		students.add("Sahil");
		students.add("Poonam");
		students.add("Poonam");
		students.add("Rakesh");
		
		System.out.println(students.get(4));
		students.remove(2);
		
		System.out.println(students.get(2));
		System.out.println(students.size());

		
	}

}
