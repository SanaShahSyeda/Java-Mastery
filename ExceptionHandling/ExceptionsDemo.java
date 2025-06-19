package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show() {
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException e) {
            System.out.println("Could not read data");
        } catch (ParseException e) {
            System.out.println("Could not parse data");
        }
    }

    public static void sayHello(final String name) {
        // Null Pointer Exception
        // Calling a method to null
        // System.out.println(name.toUpperCase());
    }
}
