package weaponProject;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1: Start game");
		System.out.println("Press 2: Exit");
		int choice=sc.nextInt();
		if(choice==1) {
		Game g=new Game();
		Weapon w=g.selectWeapon();
			w.use();	
			sc.close();
		}
		else 
			System.exit(2);
	}

}
