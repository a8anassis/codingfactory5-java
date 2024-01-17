package gr.aueb.cf.ch19.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Costas");
        map.put(4, "Demi");

        for (Iterator<Integer> itr = map.keySet().iterator(); itr.hasNext(); ) {
            Integer key = itr.next();
            if (key != 1) {
                itr.remove();
            }
        }

        map.values().removeIf(str -> !str.startsWith("A"));
        map.keySet().removeIf(key -> key != 1);
        map.entrySet().removeIf(entry -> entry.getKey() != 1);
    }
}
