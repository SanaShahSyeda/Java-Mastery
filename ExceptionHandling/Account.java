package ExceptionHandling;

import java.io.IOException;

public class Account {
    // throws: provides info method might throw IOException
    // Checked exceptions must be handled
    public void deposit(float value) throws IOException {
        // Unchecked exception
        if (value < 0) {
            throw new IllegalArgumentException();
        }
        // Checked Exception
        if (value == 0) {
            throw new IOException();
        }
    }
}
