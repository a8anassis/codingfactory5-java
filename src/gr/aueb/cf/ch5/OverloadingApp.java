package gr.aueb.cf.ch5;

/**
 * Overloading Demo.
 */
public class OverloadingApp {

    public static void main(String[] args) {

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static long add(int a, long b) {
        return a + (int) b;
    }
}
