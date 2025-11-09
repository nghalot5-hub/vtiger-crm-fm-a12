package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered_Writer {

	public static void main(String[] args) throws IOException {
		String filePath = "\\D:\\File Handling\\BufferedWriter.txt";
		File f1 = new File(filePath);
		try (FileWriter fw = new FileWriter(f1);
			BufferedWriter bw = new BufferedWriter(fw);) {
			f1.createNewFile();
			System.out.println("File is created");
			bw.write("In Java, when you want to write text to a file, the simplest option is to use a FileWriter. However, when you use FileWriter directly and call its write() methods repeatedly, every individual write operation may result in a separate I/O operation to the disk (or underlying output destination). This can be quite inefficient, especially if you are writing many small chunks of text or in a loop. To improve performance, Java provides BufferedWriter (in the java.io package) which acts as a wrapper around a Writer (such as FileWriter) and buffers the data in memory before actually writing it out. According to the Java documentation, BufferedWriter “writes text to a character-output stream, buffering characters so as to provide for the efficient writing of single characters, arrays, and strings.");
			System.out.println("File is write");
		} catch (Exception e) {
			System.out.println("File not created");
			System.out.println(e.getMessage());
		}
	}
} 