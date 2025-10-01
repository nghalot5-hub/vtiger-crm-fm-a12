package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_InputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String filePath = "D:\\AppyAppleJuice.java";
		File f1 = new File(filePath);

		try (FileInputStream fis = new FileInputStream(f1)) {
			byte[] x = fis.readAllBytes();
			while (x != null) {
				System.out.println(x);
				x = fis.readAllBytes();
			}
			System.out.println("Ends");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
