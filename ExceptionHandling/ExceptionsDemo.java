package ExceptionHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionsDemo {
    public static void show() {
        try (
                var reader = new FileReader("file.txt");
                var writer = new FileWriter("...")) {
            reader.read();
        } catch (IOException e) {
            System.out.println("Could not read data");
        }
    }
}
