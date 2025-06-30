import Generics.GenericList;

public class Main {
    public static void main(String[] args) {
        GenericList<Integer> numbers = new GenericList<Integer>();
        numbers.add(1); // Boxing
        int number = numbers.get(0); // Unboxing
    }
}
