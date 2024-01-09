package gr.aueb.cf.ch15.products.model;

public class Honey extends Product {
    private boolean isAvailable;

    public Honey() {

    }

    public Honey(long id, String productName, String description, double price, int quantity, boolean isAvailable) {
        super(id, productName, description, price, quantity);
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return super.toString() +  " Honey{" +
                "isAvailable=" + isAvailable +
                '}';
    }
}
