package productFlipkart;
import java.util.Scanner;
public class driverProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Product user=new Product();
		System.out.println("Enter Product ID: ");
		user.setpId(sc.nextInt());
		System.out.println("Enter Product Name: ");
		user.setpName(sc.next());
		System.out.println("Enter Product Brand: ");
		user.setpBrand(sc.next());
		System.out.println("Enter Product Price: ");
		user.setpPrice(sc.nextDouble());
		System.out.println("Enter Product Quantity: ");
		user.setpQuantity(sc.nextInt());
		System.out.println("Enter Product pRating: ");
		user.setpRating(sc.nextInt());
		
		System.out.println(user.getpId());
		System.out.println(user.getpName());
		System.out.println(user.getpBrand());
		System.out.println(user.getpPrice());
		System.out.println(user.getpQuantity());
		System.out.println(user.getpRating());
		
		sc.close();		
	}

}
