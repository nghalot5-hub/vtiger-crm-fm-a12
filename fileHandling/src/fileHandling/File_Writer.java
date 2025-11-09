package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {

	public static void main(String[] args) throws IOException {
		String filePath = "\\D:\\File Handling\\FileWriter.txt";
		File f1 = new File(filePath);
		try (FileWriter fw = new FileWriter(f1);) {
			f1.createNewFile();
			System.out.println("File is created");
			fw.write("Nidhi is creating a file");
			System.out.println("File is write");
		} catch (Exception e) {
			System.out.println("File not created");
			System.out.println(e.getMessage());
		}
	}

}
