package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializeDemo {
	public static void main(String[] args) {
	String filename = "Person.ser";
		Person p = new Person("Nidhi", 19, "secret11");
		// --- Serialization ---
		try (FileOutputStream fos = new FileOutputStream(filename);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			oos.writeObject(p);
			System.out.println("Object serialized: " + p);

		} catch (IOException e) {
			System.err.println("Serialization error: " + e.getMessage());
			e.printStackTrace();
		}

		System.out.println("---------------------------------------------");
		// --- Deserialization ---
		try (FileInputStream fis = new FileInputStream(filename); 
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			System.out.println(ois.readObject());
		//	System.out.println("Object deserialized: " + p2);

		} catch (IOException | ClassNotFoundException e) {
			System.err.println("Deserialization error: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
