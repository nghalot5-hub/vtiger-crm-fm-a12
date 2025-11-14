package collection_Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_Practice {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(20);
		l1.add(22);
		l1.add(30);
		l1.add(98);
		l1.add(187);
		l1.forEach(n->System.out.print(n+ " "));
		System.out.println();
		Iterator<Integer> itr=l1.iterator();
		while(itr.hasNext()) {
			Integer x=itr.next();

			System.out.print(x+" ");
			if(x%2==1)
			 itr.remove();
			
		}
		System.out.println();
		System.out.print(l1);
		}

}
