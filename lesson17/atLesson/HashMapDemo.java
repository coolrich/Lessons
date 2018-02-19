package lesson17.atLesson;

import java.util.*;

/**
 * Created by student on 18.02.2018.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Toy> map = new HashMap<>();
        map.put("Doll", new Toy("Doll", 100));
        map.put("Car", new Toy("Car", 110));
        map.put("Ball", new Toy("Ball", 120));
        map.put("Cube", new Toy("Cube", 130));

        System.out.println("Hash map:");
        iterateByEntry(map);
        System.out.println();
        iterateByKey(map);
        System.out.println();
        iterateByValue(map);

        SortedMap<String, Toy> sortedMap = new TreeMap<>(map);

        System.out.println("\nSorted map:");
        iterateByEntry(sortedMap);
        System.out.println();
        iterateByKey(sortedMap);
        System.out.println();
        iterateByValue(sortedMap);

    }

    public static void iterateByEntry(Map<String, Toy> map) {
        Set<Map.Entry<String, Toy>> set = map.entrySet();
        for (Map.Entry<String, Toy> entry : set) {
            System.out.print(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
    }

    public static void iterateByKey(Map<String, Toy> map) {
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }
    }

    public static void iterateByValue(Map<String, Toy> map) {
        Collection<Toy> values = map.values();
        for (Toy t : values) {
            System.out.println(t);
        }
    }

}
