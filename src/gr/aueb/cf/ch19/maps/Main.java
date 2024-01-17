package gr.aueb.cf.ch19.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        countries.put("GR", "Greece");
        countries.put("FR", "France");
        countries.put("USA", "United States of America");
        countries.put("DE", "Germany");

        Iterator<Map.Entry<String, String>> itr = countries.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, String> entry = itr.next();
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        countries.forEach((k, v) -> System.out.println(k + ", " + v));

        Iterator<Map.Entry<String, String>> it = countries.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            if (entry.getKey().equals("FR")) {
                it.remove();
            }
        }




    }
}
