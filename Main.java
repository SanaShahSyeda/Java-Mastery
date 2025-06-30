import Generics.GenericList;

public class Main {
    public static void main(String[] args) {
        var intItems = new GenericList<Integer>();
        intItems.add(1);
        intItems.add(2);
        intItems.add(3);
        Integer x = intItems.get(1);
        System.out.println(x);

        var moviesItems = new GenericList<String>();
        moviesItems.add("Shawshank Redemption");
        moviesItems.add("The pursuit of Happiness");
        moviesItems.add("A Beautiful mind");
        System.out.println("Value of item at index 2: " + moviesItems.get(2));
    }
}
