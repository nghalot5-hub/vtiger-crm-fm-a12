package shirt_Project;

public class Driver {

	public static void main(String[] args) {
		Service service = new Service();
		// =====================Add Shirt==========================
		service.addShirt(new Shirt("Levis", 2300, "White", 40));
		service.addShirt(new Shirt("BB", 2100, "White", 40));
		service.addShirt(new Shirt("Hrx", 2400, "Red", 42));
		service.addShirt(new Shirt("Levis", 3300, "Black", 39));
		service.addShirt(new Shirt("Levis", 4200, "White", 20));
		service.addShirt(new Shirt("Arrow", 2900, "Pink", 12));
		service.addShirt(new Shirt("BB", 5100, "Grey", 28));
		service.addShirt(new Shirt("Arrow", 9400, "White", 41));
		service.addShirt(new Shirt("Levis", 5300, "Black", 39));
		service.addShirt(new Shirt("Levis", 4200, "White", 20));
		// =============================Q1. Access all
		// shirts================================
		// System.out.println("Q1. Access all shirts");
		// service.displayAllShirt();
		// ======================Q2. Access all shirts of Arrow
		// brand========================
//		System.out.println("Q2. Access all shirts of Arrow brand");
//		service.filterOnBrand();
		// ==============Q3. Access all shirts of blackberry and size
		// 42=====================
//		System.out.println("Q3. Access all shirts of blackberry and size 42");
//		service.filterOnBrandAndSize();
		// =====================Q4. Access all shirts of price
		// <=250=========================
//		System.out.println("Access all shirts of price <=");
//		service.priceLessThan();
		// ==============Q5. Access all shirts of size 40 and
		// price>2000=========================
//		System.out.println("Access all shirts of size 40 and price>2000");
//		service.priceGreaterThan();
		// =============Q6. Sort all shirts on price low to high======================
//		System.out.println("Sort all shirts on price low to high");
//		service.priceLowToHigh();
		// =============Q7. Sort all shirts on price high to low======================
//		System.out.println("Sort all shirts on price high to low");
//		service.priceHighToLow();
		// =============Q8. Sort all shirts on Size(low to high)======================
//		System.out.println("Sort all shirts on Size(low to high)");
//		service.sortOnSize();
		// =============Q9. Sort all shirts on Size(high to low)======================
//		System.out.println("Sort all shirts on Size(high to low)");
//		service.sortOnSizeHighToLow();
		// =============Q10. List all the brands available======================
		System.out.println("List all the brands available");
		service.listAllBrandsAvailable();
		// =============Q11. List all the size available======================
		System.out.println("List all the size available");
		service.listAllSizeAvailable();
		// =============Q12. List all the color available=======================
		System.out.println("List all the size available");
		service.listAllColorAvailable();
	}

}
