package fileHandling;

import java.io.File;

public class Create_New_File {

	public static void main(String[] args) {
		String filePath = "D:\\File Handling\\file1.txt";
		File f1 = new File(filePath);

		try {
			f1.createNewFile();
		} catch (Exception e) {
			System.out.println("File is not created");
			System.out.println(e.getMessage());
		}
	}
}
