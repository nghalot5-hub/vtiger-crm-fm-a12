package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
public static void main(String[] args) {
	String filename = "person.ser";
    Person p = new Person("Alice", 30, "secret123");
 // --- Serialization ---
    try (FileOutputStream fos = new FileOutputStream(filename);
         ObjectOutputStream oos = new ObjectOutputStream(fos)) {

        oos.writeObject(p);
        System.out.println("Object serialized: " + p);

    } catch (IOException e) {
        System.err.println("Serialization error: " + e.getMessage());
        e.printStackTrace();
    }
}
}
