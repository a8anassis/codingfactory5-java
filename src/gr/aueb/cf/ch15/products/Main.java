package gr.aueb.cf.ch15.products;

import gr.aueb.cf.ch15.products.model.Product;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product product2 = new Product();
        product2.setId(5);
        product2.setProductName("Milk");

        Product product1 = new Product(1, "Honey", "My Honey", 12.8, 40);
        product1.setDescription("Mountain Honey");

//        System.out.println(product1.getId());
//        System.out.println(product2.getId());

        /*
         * Call the service.
         */
        product2.insert();
        product1.insert();

        List<Product> myProducts = Product.getProducts();

        for (Product product : myProducts) {
            System.out.println(product);
        }
    }
}
