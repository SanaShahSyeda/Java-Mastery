package ExceptionHandling;

import java.io.IOException;
import ExceptionHandling.InsufficientFundsException;
import ExceptionHandling.AccountException;

public class Account {

    private float balance;

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

    public void withdraw(float value) throws AccountException {
        if (value > balance) {
            throw new AccountException(new InsufficientFundsException());
        }
    }
}
