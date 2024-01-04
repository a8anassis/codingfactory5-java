package gr.aueb.cf.ch14;

public class Main {

    public static void main(String[] args) {
        CodingFactory codingFactory = CodingFactory.getInstance();
        CodingFactory codingFactory2 = CodingFactory.getInstance();
        codingFactory.sayHi("CF Hi!");
    }
}
