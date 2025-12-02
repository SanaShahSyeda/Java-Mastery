package Java21.SequencedCollections;

import java.util.LinkedHashMap;
import java.util.SequencedMap;

public class LRUCache {
        public static void main(String[] args) {
            SequencedMap<Integer, String> cache = new LinkedHashMap<>();

            cache.putLast(1, "Page1");
            cache.putLast(2, "Page2");
            cache.putLast(3, "Page3");

            cache.pollFirstEntry(); // removes oldest

            System.out.println(cache);
        }
}
