package StringClass;

public class CheckString {

	public static void main(String[] args) {
		String s="Hello";
		char result=s.charAt(0);
		if((result>'A' && result<'Z')||(result>'a' && result<'z'))
		{
			System.out.println("First character of string is an alphabet");
		}else if(result>'0' && result <'9')
		{
			System.out.println("First character of string is a number");
		}else
		{
			System.out.println("Its an special character");
		}

	}

}
