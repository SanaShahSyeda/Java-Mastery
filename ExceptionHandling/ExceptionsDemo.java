package ExceptionHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionsDemo {
    public static void show() {
        var account = new Account();
        try {
            account.deposit(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
