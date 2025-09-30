package shapeProject1;

public class User {

	public static void main(String[] args) {
		System.out.println("======Welcome To The Game======");
		Game g1=new Game(); //delegate 
	//	TwoDShape t=g1.selectShape(); //up-casting concept
		g1.startGame();
		System.out.println("======Visit Again======");
	}

}
