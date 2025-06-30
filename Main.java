import Generics.GenericList;
import Generics.User;
import Generics.Utils;

public class Main {
    public static void main(String[] args) {
        int max = Utils.max(1, 2);
        System.out.println(max);

        System.out.println(Utils.max(new User(20), new User(30)));
    }
}
