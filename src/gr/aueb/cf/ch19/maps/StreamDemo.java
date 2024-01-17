package gr.aueb.cf.ch19.maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {
        Map<String, Product> products = new HashMap<>();
        products.put("ORA", new Product("Oranges", 12.8, 60));
        products.put("HON", new Product("Honey", 22.2, 50));
        products.put("MIL", new Product("Milk", 2.0, 20));
        products.put("EGG", new Product("Eggs", 3.5, 100));
        products.put("EGG-LAMIA", new Product("Eggs", 13.5, 120));

        List<Product> highPricesList = products.values().stream()
                .filter(product -> product.getPrice() >= 15)
                .collect(Collectors.toList());


        Map<String, Object> criteria = new HashMap<>() {
            {
                put("description", "Eggs");
            }
        };

        String eggs = products.values().stream()
                .filter(product -> product.getDescription().equals(criteria.get("description")))
                .map(Product::toString)
                .collect(Collectors.joining());

        System.out.println(eggs);
    }
}
