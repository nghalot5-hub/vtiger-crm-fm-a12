package fileHandling;

import java.io.File;
import java.util.Scanner;

public class ReadUsingScanner {
	public static void main(String[] args) {
		String filePath="D:\\FlowControlStatement_IfElseQ1.java";
		File f1=new File(filePath);
		try(Scanner sc=new Scanner(f1);){
			while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
			}
			System.out.println("--------------Reading completed----------------");
			
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
