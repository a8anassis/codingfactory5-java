package gr.aueb.cf.ch19.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductApp {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>(List.of(
                new Product("Apples", 10.2, 40),
                new Product("Apples", 28.2, 10),
                new Product("Apples", 8.2, 80),
                new Product("Oranges", 6.7, 35),
                new Product("Oranges", 8.1, 65),
                new Product("Eggs", 10.5, 140),
                new Product("Honey", 26.0, 335)
        ));

        List<Product> apples = productList.stream()
                .filter(product -> product.getDescription().equals("Apples"))
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());

        apples.forEach(System.out::println);

        List<Double> prices = productList.stream()
                .map(Product::getPrice)
                .collect(Collectors.toList());

        List<Product> updatedPriceProducts = productList.stream()
                .map(p -> new Product(p.getDescription(), p.getPrice() * 0.2, p.getQuantity()))
                .collect(Collectors.toList());


        int orangesCount = productList.stream()
                .filter(product -> product.getDescription().equals("Oranges"))
                // total = total + quantity
                .reduce(0, (total, p) -> total + p.getQuantity(), Integer::sum);

        int orangesCount2 = productList.stream()
                .filter(product -> product.getDescription().equals("Oranges"))
                .mapToInt(Product::getQuantity)
                .sum();











//        Collections.sort(productList, Comparator.naturalOrder());
//        Collections.sort(productList, Comparator.reverseOrder());

        //Collections.sort(productList, Comparator.comparing(Product::getDescription).thenComparing(Product::getQuantity).reversed());

//        Collections.sort(productList, Comparator.comparing(Product::getDescription).thenComparing(Product::getPrice, Comparator.reverseOrder()));
//        productList.forEach(System.out::println);



//        Collections.sort(productList);
//        productList.forEach(System.out::println);
//
//        Collections.reverse(productList);
//        productList.forEach(System.out::println);
    }
}
