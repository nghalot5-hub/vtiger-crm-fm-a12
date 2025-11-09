package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_OutputStream {

	public static void main(String[] args) throws IOException {
		String filePath = "\\D:\\File Handling\\FileOutputStream.txt";
		File f1 = new File(filePath);
		try (FileOutputStream fos = new FileOutputStream(f1,true);) {
			f1.createNewFile();
			System.out.println("File is created ]n");
			fos.write(("Nidhi is creating a file \n").getBytes());
			fos.write(("Nidhi is creating a file \n").getBytes());

			System.out.println("File is write");
		} catch (Exception e) {
			System.out.println("File not created");
			System.out.println(e.getMessage());
		}
	}

}
	