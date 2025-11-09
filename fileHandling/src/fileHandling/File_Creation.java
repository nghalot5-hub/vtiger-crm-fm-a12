package fileHandling;

import java.io.File;
import java.io.IOException;

public class File_Creation {
	
	public static void main(String[] args) throws IOException {
		String filePath="//D://createNewFile.txt";
		File file=new File(filePath);
		try {
		file.createNewFile();
		System.out.println("File is created");
		}catch(Exception e){
			System.out.println("File not created");
			System.out.println(e.getMessage());
		}
	}
}
