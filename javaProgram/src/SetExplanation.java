import java.util.HashSet;
import java.util.Set;

public class SetExplanation {

	public static void main(String[] args) {
		Set<Object> students=new HashSet<Object>();
		students.add("Sahil");
		students.add("Poonam");
		students.add("Poonam");
		students.add("Nidhi");
		students.add("Rakesh");
		
		System.out.println(students.get(4));
		students.remove(2);
		
	//	System.out.println(students.get(2));
		System.out.println(students.size());

	}

}
