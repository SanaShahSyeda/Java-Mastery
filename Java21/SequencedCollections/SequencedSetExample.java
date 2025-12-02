package Java21.SequencedCollections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class SequencedSetExample {
    public static void main(String[] args) {
        SequencedSet<Integer> set = new LinkedHashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println(set.getFirst()); // 10
        System.out.println(set.getLast());  // 30

        // Before Java 21
        Iterator<Integer> it = set.iterator();
        Integer last = null;
        while (it.hasNext()) {
            last = it.next();
        }
        set.remove(last);
        System.out.println(set);


        // After Java 21
        set.removeLast();
        System.out.println(set); // [10, 20]
    }
}
