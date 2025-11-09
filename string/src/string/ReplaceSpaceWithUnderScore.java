package string;

import java.util.Scanner;
class ReplaceSpaceWithUnderScore{
	public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
        		System.out.print("Enter string: ");
			String s=sc.nextLine();
			
        		System.out.print(s.replace(" ", "_"));
        		sc.close();
		}
} 
