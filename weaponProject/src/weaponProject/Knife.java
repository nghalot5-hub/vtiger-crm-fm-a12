package weaponProject;

public class Knife extends Weapon{
	public void use() {
		System.out.println("Use the Knife");
		swing();
		System.out.println("Good Job");
		System.out.println("You Killed enemy..");
	}
	private void swing() {
		System.out.println("Aim at enemy");
		System.out.println("Swing the Knife");
	}
}
