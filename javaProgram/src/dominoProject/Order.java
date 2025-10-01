package dominoProject;
import java.util.Scanner;

public class Order {
	Scanner sc=new Scanner(System.in);
	
	public void placeYourOrder() {
		System.out.println("Press 1: Veg Pizza \nPress 2: Non-Veg Pizza \nPress 3: Garlic Breads and more \nPress 4: Beverages \nPress 5: Dessert");
		int choice=sc.nextInt();
		int ch;
		switch(choice) {
			case 1: VegPizza vp=selectVegPizza();
					vp.placeOrder();
					vp.eat();
					System.out.println("1. Main menu \n2. Exit");
					ch=sc.nextInt();
					if(ch==1) {
						placeYourOrder();
					}
					else
					break;
			case 2: NonVegPizza nvp=selectNonVegPizza();
					nvp.placeOrder();
					nvp.eat();
					System.out.println("1. Main menu \n2. Exit");
					ch=sc.nextInt();
					if(ch==1) {
						placeYourOrder();
					}
					else
					break;
			case 3: GarlicBreadsAndMore gb=selectGarlicBreadsAndMore();
					gb.placeOrder();
					gb.eat();
					System.out.println("1. Main menu \n2. Exit");
					ch=sc.nextInt();
					if(ch==1) {
						placeYourOrder();
					}
					else
					break;
			case 4: Beverages b=selectBeverages();
					b.placeOrder();
					b.drink();
					System.out.println("1. Main menu \n2. Exit");
					ch=sc.nextInt();
					if(ch==1) {
						placeYourOrder();
					}
					else
					break;
			case 5: Dessert d= selectDessert();
					d.placeOrder();
					d.eat();
					System.out.println("1. Main menu \n2. Exit");
					ch=sc.nextInt();
					if(ch==1) {
						placeYourOrder();
					}
					else
					break;
					default:System.out.println("Invalid Choice, select again");
					placeYourOrder();
				}
			}
	
	public VegPizza selectVegPizza() {
		System.out.println("Press 1: Cheese Volcano Peppy Pizza \nPress 2: Margeherita \nPress 3: Farmhouse \nPress 4: Peppy Paneer \nPress 5: Cheese n Corn");
		int choice=sc.nextInt();
		switch(choice) {
			case 1:System.out.println("Add number of item: "); 
				int quantity=sc.nextInt();
				CheeseVolcanoPeppyPaneer cvpp=new CheeseVolcanoPeppyPaneer(quantity);
				return cvpp;
			case 2: Margeherita mg=new Margeherita();
				return mg;		
			case 3: Farmhouse fh=new Farmhouse();
				return fh;
			case 4: PeppyPaneer pp=new PeppyPaneer();
				return pp;
			case 5: CheeseNCorn cc=new CheeseNCorn();
				return cc;
			default:System.out.println("Invalid Choice, select again");
				return selectVegPizza();
				}
			}

	public NonVegPizza selectNonVegPizza() {
		System.out.println("Press 1: Spiced Double Chicken \nPress 2: Chicken Pepporani \nPress 3: Chicken Dominator");
		int choice=sc.nextInt();
		switch(choice) {
			case 1:SpicedDoubleChicken sdc=new SpicedDoubleChicken();
				return sdc;
			case 2:ChickenPepperoni cp=new ChickenPepperoni();
				return cp;
			case 3:ChickenDominator cd=new ChickenDominator();
				return cd;
			default:System.out.println("Invalid Choice, select again");
				return selectNonVegPizza();
			}
		}
	
	public GarlicBreadsAndMore selectGarlicBreadsAndMore() {
		System.out.println("Press 1: Garlic Breads \nPress 2: Non-Veg Parcel \nPress 3: Veg Parcel \nPress 4: Cheesy Dip");
		int choice=sc.nextInt();
		switch(choice) {			
		case 1:GarlicBreads gb=new GarlicBreads();
			return gb;
		case 2:NonVegParcel nvp=new NonVegParcel();
			return nvp;
		case 3:VegParcel vp=new VegParcel();
			return vp;
		case 4:CheesyDip cd=new CheesyDip();
			return cd;
		default:System.out.println("Invalid Choice, select again");
			return selectGarlicBreadsAndMore();
			}
		}
							
	public Beverages selectBeverages() {
		System.out.println("Press 1: Coca Cola \nPress 2: Nagpur Orange \nPress 3: Sprite");
		int choice=sc.nextInt();
		switch(choice) {			
		case 1:CocaCola cc=new CocaCola();
			return cc;
		case 2:NagpurOrange no=new NagpurOrange();
			return no;
		case 3:Sprite s=new Sprite();
			return s;
		default:System.out.println("Invalid Choice, select again");
			return selectBeverages();
			}
		}
		
	public Dessert selectDessert() {
		System.out.println("Press 1: Choco Lava Cake \nPress 2: Butterscotch Mousse Cake");
		int choice=sc.nextInt();
		switch(choice) {			
		case 1:ChocoLavaCake clc=new ChocoLavaCake();
			return clc;
		case 2:ButterscotchMousseCake bmc=new ButterscotchMousseCake();
			return bmc;
		default:System.out.println("Invalid Choice, select again");
			return selectDessert();
			}
	}
}