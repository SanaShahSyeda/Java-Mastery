import ExceptionHandling.ExceptionsDemo;
import Generics.List;
import Generics.User;

public class Main {
    public static void main(String[] args) {
        var list = new List();
        // compiled to Integer.valueOf(1)
        list.add(Integer.valueOf(1));
        list.add("3");
        list.add(new User());

        // explicit casting required
        int number = (int) list.get(0);

        // ClassCastException if wrong type used
        // results in runtime exceptions
        // int temp = (int) list.get(1);
    }
}
