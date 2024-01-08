package gr.aueb.cf.ch15.products;

import gr.aueb.cf.ch15.products.model.IProduct;
import gr.aueb.cf.ch15.products.model.Milk;
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

        Milk myMilk = new Milk(1, "Milk A", "Athens Milk", 10.9, 1, "Milky");
        myMilk.insert();

        Milk milk = myMilk.get();

                IProduct iProduct = new Product(5, "Apple", "Greek Apples", 20.8, 80);
        iProduct.insert();

        /*
         * Call the service.
         */
        product2.insert();
        product1.insert();

        List<IProduct> myProducts = Product.getProducts();

        for (IProduct product : myProducts) {
            System.out.println(product);
        }
    }
}
