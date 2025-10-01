package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Writer {

	public static void main(String[] args) throws IOException {
		
		String filePath = "D:\\File Handling\\file1.txt";
		File f1 = new File(filePath);
		try(FileWriter fw=new FileWriter(f1,true)){		//fileWriter
		fw.write(98);
		fw.write("Sahil");
		}catch(Exception e) {
			System.out.println("File is updated");
			System.out.println(e.getMessage());
			}
		System.out.println("========================================");
		System.out.println("===FileOutputStream======");
		//FileOutputStream
		String filePath2 = "D:\\File Handling\\file3.txt";
		File f3 = new File(filePath2);
		try(FileOutputStream fos=new FileOutputStream(f3);
				Scanner sc=new Scanner(System.in);
				){
			
			fos.write(65);
			fos.write("abcd\n".getBytes());
			System.out.println("Enter name: ");
			String name=sc.nextLine();
			System.out.println("Enter Age: ");
			int age=sc.nextInt();
			System.out.println("Enter Weight: ");
			double weight=sc.nextDouble();
			fos.write(("Name is: "+name+"\n").getBytes());
			fos.write(("Age is : "+age+"\n").getBytes());
			fos.write(("Weight is : "+weight+"kg\n").getBytes());
		}catch(Exception e) {
			e.getMessage();
		}
		System.out.println("=====FileOutputStream ends=====");
		System.out.println("========================================");
		
		//buffered writer
		String filePath1 = "D:\\File Handling\\file2.txt";
		File f2 = new File(filePath1);
		try(FileWriter fw=new FileWriter(f2,true);
				BufferedWriter bw=new BufferedWriter(fw);){		
		bw.write('S');
		bw.write(100);
		bw.write("Nisa");
		}catch(Exception e) {
			System.out.println("File is updated");
			System.out.println(e.getMessage());
			}
		System.out.println("========================================");
		
		
		
	}

}
