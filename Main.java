import Generics.GenericList;
import Generics.Instructor;
import Generics.User;
import Generics.Utils;

public class Main {
    public static void main(String[] args) {
        User user = new Instructor(10);
        Utils.printUser(new Instructor(20));

        var users = new GenericList<User>();
        Utils.addUsers(users);
        Utils.printUsers(users);
    }
}
