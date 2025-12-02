package Java21.SequencedCollections;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class SequencedCollectionExample {
    public static void main(String[] args) {
        SequencedCollection<String> cities = new ArrayList<String>();

        cities.addLast("Karachi");
        cities.addLast("Lahore");
        cities.addLast("Islamabad");
        cities.addFirst("Sukkur");

        System.out.println(cities);

        // Before Java 21
        System.out.println(((ArrayList<String>) cities).get(0)); // first element
        System.out.println(((ArrayList<String>) cities).get(cities.size() - 1)); // last element
        // After Java 21
        System.out.println(cities.getFirst()); // First element
        System.out.println(cities.getLast()); // Last element
    }
}
