package inheritance;

public class StudentDriver {

	public static void main(String[] args) {
		Student st1=new Student("TRMPS","Modinagar",2000,"King of fruits","Summer");
		System.out.println(st1.getStudDetails());
		System.out.println("===========================================");
		School sc1=new School("Apple",250);
		System.out.println(sc1.getSchoolDetails());
	}

}
