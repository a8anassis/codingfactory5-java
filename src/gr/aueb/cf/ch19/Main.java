package gr.aueb.cf.ch19;

public class Main {

    public static void main(String[] args) {
        FlexibleNode flexibleNode1 = new FlexibleNode();
        flexibleNode1.setItem("Hello");

        FlexibleNode flexibleNode2 = new FlexibleNode();
        flexibleNode2.setItem(2);

        int myInt = (int) flexibleNode1.getItem();

        System.out.println(myInt);
    }
}
