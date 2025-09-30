package weaponProject;
import java.util.Scanner;
public class Game {
	
	Game(){
		System.out.println("====Game Has Started====");
	}
	
	public Weapon selectWeapon() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter score");
		int score=sc.nextInt();
			if(score<=400) {
				Knife k=new Knife();
				return k;
			}
			else if(score<=800) {
				Gun g=new Gun();
				return g;
			}
			else {
				Bomb b=new Bomb();
				return b;
			}
	}
}
