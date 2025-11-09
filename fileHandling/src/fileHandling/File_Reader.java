package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File_Reader {

	public static void main(String[] args) throws IOException {
		String filePath = "\\D:\\File Handling\\FileWriter.txt";
		//file contains: Nidhi is creating a file
		File f1 = new File(filePath);
		try (FileReader fr = new FileReader(f1);) {
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print((char)fr.read());
			System.out.print(fr.read()); //ascii value of e will be print
		} catch (Exception e) {
			System.out.println("File not created");
			System.out.println(e.getMessage());
		}
	}

}
