package gr.aueb.cf.ch16.products;

public class Milk extends AbstractGenericProduct implements IMilk {
    private String manufacturer;

    public Milk() {

    }

    public Milk(long id, String productName, String description, double price, int quantity, String manufacturer) {
        super(id, productName, description, price, quantity);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public Milk get() {
        return this;
    }
}
