package gr.aueb.cf.ch16.products;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class AbstractGenericProduct implements IGenericProduct {

    private static List<IGenericProduct> products = new ArrayList<>();

    private long id;
    private String productName;
    private String description;
    private double price;
    private int quantity;

    public AbstractGenericProduct() {

    }

    public AbstractGenericProduct(long id, String productName, String description, double price, int quantity) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public static List<IGenericProduct> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public static void setProducts(List<IGenericProduct> products) {
        AbstractGenericProduct.products = products;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void insert() {
        products.add(this);
    }
}
