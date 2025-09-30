package shirt_Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Service {
	private List<Shirt> l1 = new ArrayList<>();// data become private
	private Scanner sc = new Scanner(System.in);

	public void addShirt(Shirt s) {
		l1.add(s);
	}

	public void displayAllShirt() {
		for (Shirt s : l1) {
			System.out.println(s);
		}
	}

	public void filterOnBrand() {
		System.out.println("Enter the brand: ");
		String brand = sc.nextLine();
		for (Shirt s : l1) {
			if (s.brand.equalsIgnoreCase(brand)) {
				System.out.println(s);
			}
		}

	}

	public void filterOnBrandAndSize() {
		System.out.println("Enter the brand: ");
		String brand = sc.nextLine();
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		int count = 0;
		for (Shirt s : l1) {
			if (s.brand.equalsIgnoreCase(brand) && s.size == size) {
				System.out.println(s);
				count++;
			}
		}
		if (count == 0)
			System.out.println(brand + " shirt of " + size + " is not available.");
		else
			System.out.println(count + "shirt of" + brand + " of" + size + " are available.");
	}

	public void priceLessThan() {
		System.out.println("Enter the price: ");
		double price = sc.nextDouble();
		for (Shirt s : l1) {
			if (s.price < price)
				System.out.println(s);
		}
	}

	public void priceGreaterThan() {
		System.out.println("Enter the price: ");
		double price = sc.nextDouble();
		for (Shirt s : l1) {
			if (s.price > price)
				System.out.println(s);
		}
	}

	public void priceLowToHigh() {
		Collections.sort(l1, Comparator.comparingDouble(o->o.price));
		displayAllShirt();
	}
	
	public void priceHighToLow() {
		//Collctions.sort(l1,(a,b)->a.size-b.size);
		//Collections.sort(l1, Comparator.comparingDouble((o)->o.price).reversed());
		//Wants to connect
		Collections.sort(l1, Comparator.comparingDouble((Shirt o)->o.price).reversed());
		displayAllShirt();
	}
	public void sortOnSizeLowToHigh() {
		//Wants to connect
		Collections.sort(l1, Comparator.comparingInt((Shirt o)->o.size));
		displayAllShirt();
	}
	
	public void sortOnSizeHighToLow() {
		//Wants to connect
		Collections.sort(l1, Comparator.comparingInt((Shirt o)->o.size).reversed());
		displayAllShirt();
	}
	
	public void sortOnSizeThen() {
		//Wants to connect
		Collections.sort(l1, Comparator.comparingInt((Shirt o)->o.size).reversed());
		displayAllShirt();
	}
	
	

	public void listAllBrandsAvailable() {
		Set<String> brands=new HashSet<>();
		for (Shirt s : l1) {
			brands.add(s.brand);	
		}
		System.out.println("All Brands are: "+brands);	
	}
	public void listAllSizeAvailable() {
		Set<Integer> size=new HashSet<>();
		for (Shirt s : l1) {
			size.add(s.size);	
		}
		System.out.println("All Brands are: "+size);	
	}
	public void listAllColorAvailable() {
		Set<String> color=new HashSet<>();
		for (Shirt s : l1) {
			color.add(s.color);	
		}
		System.out.println("All Brands are: "+color);	
	}
}
