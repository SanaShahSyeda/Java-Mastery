package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {
    public static void show() {
        // sayHello(null);
        try {
            var reader = new FileReader("file.txt");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("File opened");
    }

    public static void sayHello(String name) {
        // Null Pointer Exception
        // Calling a method to null
        // System.out.println(name.toUpperCase());
    }
}
