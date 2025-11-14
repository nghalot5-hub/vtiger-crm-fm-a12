package collection_Practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveForEachLoop {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(20);
		l1.add(22);
		l1.add(30);
		l1.add(98);
		l1.add(187);
		l1.forEach(n -> System.out.print(n + " "));
		for(Integer x:l1) {
			if(x%2==0)
			 l1.remove(x);
		}
		System.out.println();
		l1.forEach(n -> System.out.print(n + " "));

}
}