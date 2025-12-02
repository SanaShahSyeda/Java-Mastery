package Java21.SequencedCollections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SequencedMap;

public class SequencedMapExample {
    public static void main(String[] args) {
        SequencedMap<String, Integer> map = new LinkedHashMap<>();

        // After java 21
        map.putLast("Ali", 100);
        map.putLast("Sara", 200);
        map.putLast("John", 300);
        map.putFirst("Admin", 999);

        // Fetch first item
        System.out.println(map.firstEntry()); // Ali=100
        // Fetch last item
        System.out.println(map.lastEntry());  // John=300
        System.out.println(map);  // {Admin=999, Ali=100, Sara=200, John=300}

        // Before java 21
        Map<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("Ali", 100);
        map2.put("Sara", 200);
        map2.put("John", 300);

        // Fetch first item
        Map.Entry<String, Integer> first = null;
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            first = e;
            break;
        }
        System.out.println(first); // Ali=100

        // Fetch last item
        Map.Entry<String, Integer> last = null;
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            last = e;
        }
        System.out.println(last); // John=300

        // Insert item at begining
        Map<String, Integer> newMap = new LinkedHashMap<>();

        newMap.put("Admin", 999);

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            newMap.put(e.getKey(), e.getValue());
        }

        map2 = newMap;

        System.out.println(map2); // {Admin=999, Ali=100, Sara=200, John=300}

    }
}
