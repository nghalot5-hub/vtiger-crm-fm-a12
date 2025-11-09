package fileHandling;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Buffered_OutputStream {

	public static void main(String[] args) throws IOException {
		String filePath = "\\D:\\File Handling\\BufferedOutputStream1.txt";
		File f1 = new File(filePath);
		try (FileOutputStream fos = new FileOutputStream(f1,true);
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {
			f1.createNewFile();
			System.out.println("File is created ]n");
			bos.write(("file is creating a file \n").getBytes());
			bos.write(("Nidhi is creating a file \n").getBytes());

			System.out.println("File is write");
		} catch (Exception e) {
			System.out.println("File not created");
			System.out.println(e.getMessage());
		}
	}

}
