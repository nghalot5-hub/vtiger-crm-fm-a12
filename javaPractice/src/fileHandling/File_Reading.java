package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Reading {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String filePath = "D:\\AppyAppleJuice.java";
		File f1 = new File(filePath);

		try (FileReader fr = new FileReader(f1)) {
			int x = fr.read();
			while (x != -1) {
				System.out.print((char) x);
				x = fr.read();
			}
			System.out.println("Ends");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
