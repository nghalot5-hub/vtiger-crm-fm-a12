package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Bufferred_Reader {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String filePath = "D:\\AppyAppleJuice.java";
		File f1 = new File(filePath);
		System.out.println("==============Starts=================");

		try (FileReader fr = new FileReader(f1); 
			BufferedReader bfr = new BufferedReader(fr);) {
			int x = bfr.read();
			while (x != -1) {
				System.out.print((char) x);
				x = bfr.read();
			}
			System.out.println("==============Ends=================");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
