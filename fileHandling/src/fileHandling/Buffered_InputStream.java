package fileHandling;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Buffered_InputStream {

	public static void main(String[] args) throws IOException {
		String filePath = "D:\\File Handling\\FileOutputStream.txt";
		File f1 = new File(filePath);
		try (FileInputStream fis = new FileInputStream(f1);
				BufferedInputStream bis = new BufferedInputStream(fis)	) {
			int x = fis.read();
			while(x!=-1) {
				System.out.print((char)x);
				x=fis.read();
			}
			System.out.println("File reading is completed");
		} catch (Exception e) {
			System.out.println("File not created");
			System.out.println(e.getMessage());
		}
	}

}
