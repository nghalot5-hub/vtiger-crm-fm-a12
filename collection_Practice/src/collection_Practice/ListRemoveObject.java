package collection_Practice;

import java.util.ArrayList;
import java.util.List;

public class ListRemoveObject {
	public static void main(String[] args) {
			List<Integer> l1 = new ArrayList<>();
			l1.add(20);
			l1.add(22);
			l1.add(30);
			l1.add(98);
			l1.add(187);
			l1.forEach(n -> System.out.print(n + " "));
			l1.remove((Object)22); //remove Object 
			System.out.println();
			l1.forEach(n-> System.out.print(n +" "));
	}

}
