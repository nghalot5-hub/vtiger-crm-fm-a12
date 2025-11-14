package string;

import java.util.Scanner;

public class Permute {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		String s=sc.nextLine();
		permute("",s);
		sc.close();
	}

	public static void permute(String prefix, String remaining) {
		if(remaining.length()==0) {
			System.out.println(prefix);
			return;
		}
		
		for(int i=0;i<remaining.length();i++) {
			char c=remaining.charAt(i);
			String left=remaining.substring(0,i);
			String right=remaining.substring(i+1);
			permute(prefix+c, left+right);
		}
		
	}
	
	

}
