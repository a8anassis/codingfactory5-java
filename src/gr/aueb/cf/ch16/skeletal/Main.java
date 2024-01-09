package gr.aueb.cf.ch16.skeletal;

public class Main {

    public static void main(String[] args) {
        //Square square = new Square(2, 4);
        Square square = new Square();
        square.setHeight(2);
        square.setWidth(4);

        System.out.println(square);
    }
}
