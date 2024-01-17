package gr.aueb.cf.ch19.maps;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {

    public static void main(String[] args) {

        Map<String, Object> criteria = new HashMap<>() {{
           put("price", 10.50);
           put("quantity", 10);
           put("description", "Oranges");
        }};

        Map<String, Object> criteria2 = Map.of("price", 10.30, "quantity", 20, "description", "Oranges");

        Map<String, Object> criteria3 = new HashMap<>(Map.of("price", 10.30, "quantity", 20, "description", "Oranges"));

    }
}
