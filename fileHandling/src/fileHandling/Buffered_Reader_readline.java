package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Buffered_Reader_readline {

	public static void main(String[] args) throws IOException {
		String filePath = "\\D:\\File Handling\\BufferedWriter.txt";
		File f1 = new File(filePath);
		try (FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);) {
			String x=br.readLine();
			while(x!=null){
				System.out.print(x);
				x=br.readLine();
			}
			System.out.println();
			System.out.println("File reading is completed");
		} catch (Exception e) {
			System.out.println("File not created");
			System.out.println(e.getMessage());
		}
	}
} 