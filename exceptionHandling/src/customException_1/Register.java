package customException_1;
public class Register extends Throwable{
	public static void checkEligibilty(int age) throws UnderAgeException {
		if(age>=18) {
			System.out.println("you are eligible for registration");
		}else {
			throw new UnderAgeException("Invalid age enter");
		}}}
