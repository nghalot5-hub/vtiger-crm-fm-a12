package string;

import java.util.Scanner;

//Write a program in Java to remove path information from a filename returning only its file component.
// i/p: "c:\\JavaProgram\\demo1.txt“
// o/p: demo1.txt

public class RemovePath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = sc.nextLine();
		String resultantString = removePathReturnFileComponent(s);
		System.out.println(resultantString);
		sc.close();
	}

	public static String removePathReturnFileComponent(String s) {
		String fileName="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='\\')
				fileName="";
			else
				fileName=fileName+c;
		}
		return fileName;

	}

}
